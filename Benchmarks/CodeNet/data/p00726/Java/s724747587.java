import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			s = sc.next();
			BigInteger I = sc.nextBigInteger();
			if(s.equals("0") && I.equals(BigInteger.ZERO)) break;

			tree = new ArrayList<Node>();
			tree.add(new Node(' ',new ArrayList<Edge>()));
			idx = 0;
			makeMap(0);

			BigInteger sum = BigInteger.ZERO;
			for(Edge e : tree.get(0).eds) sum = sum.add(e.cost);
			System.out.println(sum.compareTo(I) <= 0 ? '0' : solve(I,0));
		}
	}

	private static String s;
	private static ArrayList<Node> tree;
	private static int idx;

	private static char solve(BigInteger rem,int pos){
		if(tree.get(pos).ch != ' '){
			return tree.get(pos).ch;
		}

		ArrayList<Edge> tmp = tree.get(pos).eds;
		int npos = 0;
		BigInteger sum = BigInteger.ZERO;
		int i = 0;
		for(;sum.compareTo(rem) <= 0 && i<tmp.size();i++){
			sum = sum.add(tmp.get(i).cost);
		}
		i--;
		rem = rem.subtract(sum).add(tmp.get(i).cost);

		return solve(rem.remainder(tmp.get(i).cost.divide(new BigInteger(Integer.toString(tmp.get(i).d)))), tmp.get(i).to);
	}

	private static BigInteger makeMap(int pos){
		BigInteger res = BigInteger.ZERO;
		BigInteger mul = BigInteger.ONE;

		for(;idx<s.length();idx++){
			char ch = s.charAt(idx);

			if('A' <= ch && ch <= 'Z'){
				tree.add(new Node(ch,new ArrayList<Edge>()));
				tree.get(pos).eds.add(new Edge(tree.size()-1,mul,1));
				res = res.add(mul);
			}
			else if(ch == '('){
				idx++;
				tree.add(new Node(' ',new ArrayList<Edge>()));
				int npos = tree.size() - 1;
				BigInteger cost = makeMap(npos);
				tree.get(pos).eds.add(new Edge(npos,cost.multiply(mul),Integer.parseInt(mul.toString())));
				res = res.add(cost.multiply(mul));
				mul = BigInteger.ONE;
			}
			else if(ch == ')'){
				return res;
			}
			else{
				String muls = "";
				for(;'0'<=s.charAt(idx) && s.charAt(idx)<='9';idx++)
					muls += s.charAt(idx);
				mul = new BigInteger(muls);
				idx--;
			}
		}
		return res;
	}
}

class Node{
	char ch;
	ArrayList<Edge> eds;

	Node(char ch,ArrayList<Edge> eds){
		this.ch = ch;
		this.eds = new ArrayList<Edge>(eds);
	}

	public String toString(){
		return String.format("[%c,"+eds+"]",ch);
	}
}

class Edge{
	int to;
	BigInteger cost;
	int d;

	Edge(int to,BigInteger cost,int d){
		this.to = to;
		this.cost = cost;
		this.d = d;
	}

	public String toString(){
		return String.format("[to%d,%s/%d]",to,cost.toString(),d);
	}
}