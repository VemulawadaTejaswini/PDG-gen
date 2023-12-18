import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			s = br.readLine();
			if (s.equals("#")) {
				break;
			}
			i = 0;
			
			System.out.println(buildExprTree().getResults().size());
			
//			Permutation p = new Permutation(4);
//			do {
//				System.out.println(Arrays.toString(p.data));
//			} while(p.nextPermutaion());
			
		}
	}
	
	static enum State {
		NONE, NUM, OPER
	}
	
	static int i = 0;
	static String s;
	
	static Expr buildExprTree() {
		int numTemp = 0;
		State state = State.NONE;
		List<Expr> exprs = new ArrayList<Expr>();
		List<Operator> opers = new ArrayList<Operator>();
		
		for (; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				if(state != State.NUM) {
					state = State.NUM;
					numTemp = c - '0';
				}
				else {
					numTemp *= 10;
					numTemp += c - '0';
				}
			}
			else {
				if(state == State.NUM) {
					exprs.add(new Num(numTemp));
					//System.out.println("detected:" + numTemp);
					state = State.OPER;
				}
				if(c == '(') {
					i++;
					exprs.add(buildExprTree());
				}
				else if(c == ')') {
					return new BraceExpr(exprs, opers);
				}
				else {
					opers.add(Operator.operatorMap.get(c));
				}
			}
		}
		if(state == State.NUM) {
			exprs.add(new Num(numTemp));
		}
		return new BraceExpr(exprs, opers);
		
	}
	
	static abstract class Expr {
		Set<Integer> results;
		
		Set<Integer> getResults() {
			if(results == null)
				return results = computeResults();
			return results;
		}
		
		abstract Set<Integer> computeResults();
	}
	
	static class BraceExpr extends Expr {

		final List<Expr> exprs;
		final List<Operator> opers;
		
		public BraceExpr(List<Expr> exprs, List<Operator> opers) {
			super();
			this.exprs = exprs;
			this.opers = opers;
		}

		@Override
		Set<Integer> computeResults() {
			int size = exprs.size();
			
			if(size == 0)
				return Collections.emptySet();
			if(size == 1)
				return exprs.get(0).computeResults();
			

			Set<Integer> mergeResults = new HashSet<Integer>();
			
			Permutation p = new Permutation(opers.size());
			do {
				Set<Integer>[] resultList = new Set[size]; 
				for (int i = 0; i < resultList.length; i++) {
					resultList[i] = exprs.get(i).getResults();
				}
				UnionFind uf = new UnionFind(size);
				
				for (int i = 0; i < opers.size(); i++) {
					int left = uf.find(p.data[i]);
					int right = uf.find(p.data[i] + 1);
					Operator op = opers.get(p.data[i]);
					uf.unite(left, right);

					Set<Integer> leftResults = resultList[left];
					Set<Integer> rightResults = resultList[right];
					Set<Integer> results = new HashSet<Integer>();
					
					for (int a : leftResults) {
						for (int b : rightResults) {
							try {
								results.add(op.operate(a, b));
							} catch (ArithmeticException e) {
							}
						}
					}
					resultList[left] = resultList[right] = results;
				}
				for (Integer n : resultList[uf.find(0)]) {
					mergeResults.add(n);
				}
				
				
			} while(p.nextPermutaion());
			
			
			return mergeResults;
		}
		
	}
	
	static class Num extends Expr {

		final int n;
		
		public Num(int n) {
			super();
			this.n = n;
		}

		@Override
		Set<Integer> computeResults() {
			return Collections.singleton(n);
		}
	}
	
	static class UnionFind {
		final int[] data;

		public UnionFind(int size) {
			data = new int[size];
			for (int i = 0; i < size; i++) {
				data[i] = i;
			}
		}

		int find(int x) {
			if(data[x] == x)
				return x;
			else
				return data[x] = find(data[x]);
		}

		void unite(int x, int y) {
			data[x] = data[y];
		}
	}
	
	static class Permutation {
		final int[] data;
		final TreeSet<Integer> temp = new TreeSet<Integer>();

		public Permutation(int size) {
			data = new int[size];
			for (int i = 0; i < size; i++) {
				data[i] = i;
			}
		}
		
		boolean nextPermutaion() {
			int i = data.length - 1;
			temp.clear();
			temp.add(data[i--]);
			while (i >= 0) {
				Integer minGreater = temp.higher(data[i]);
				if(minGreater == null) {
					temp.add(data[i--]);
				}
				else {
					temp.add(data[i]);
					temp.remove(minGreater);
					data[i++] = minGreater;
					for (; i < data.length; i++) {
						data[i] = temp.pollFirst();
					}
					return true;
				}
			}
			return false;
		}
	}
	
	static enum Operator {
		PLUS('+') {
			@Override
			int operate(int a, int b) {
				return a+b;
			}
		},
		SUB('-') {
			@Override
			int operate(int a, int b) {
				return a-b;
			}
		},
		MULTI('*') {
			@Override
			int operate(int a, int b) {
				return a*b;
			}
		},
		DIV('/') {
			@Override
			int operate(int a, int b) {
				return a/b;
			}
		};
		final char operator;
		
		private Operator(char o) {
			operator = o;
		}
		
		/**
		 * @throws ArithmeticException
		 */
		abstract int operate(int a, int b);
		
		static final Map<Character, Operator> operatorMap = new HashMap<Character, Operator>() {
			{
				for (Operator operator : Operator.values()) {
					put(operator.operator, operator);
				}
			}
		};
	}

}