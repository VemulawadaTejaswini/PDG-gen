import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	String input;
	int p;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			input = in.nextLine();
			if(input.equals("#")) return ;
			System.out.println(solve());
		}
	}

	int solve(){
		p = 0;
		return expr().size();
	}

	Set<Integer> rec(ArrayList<Set<Integer>> nums, ArrayList<Character> ops, ArrayList< ArrayList<Set<Integer> > > memo, int from, int to){
		if(memo.get(from).get(to) != null){
			return memo.get(from).get(to);
		}
		if(from == to){
			memo.get(from).set(to, nums.get(from));
			return memo.get(from).get(to);
		}
		Set<Integer> ret = new HashSet<Integer>();
		for(int i=from; i<to; i++){
			Integer[] x = rec(nums, ops, memo, from, i).toArray(new Integer[0]),
					y = rec(nums, ops, memo, i+1, to).toArray(new Integer[0]);
			for(int j=0; j<x.length; j++){
				for(int k=0; k<y.length; k++){
					if(ops.get(i) == '+'){
						ret.add(x[j].intValue() + y[k].intValue());
					}
					else if(ops.get(i) == '-'){
						ret.add(x[j].intValue() - y[k].intValue());
					}
					else if(ops.get(i) == '*'){
						ret.add(x[j].intValue() * y[k].intValue());
					}
					else if(ops.get(i) == '/' && y[k].intValue() != 0){
						ret.add(x[j].intValue() / y[k].intValue());
					}
				}
			}
		}
		memo.get(from).set(to, ret);
		return ret;
	}

	Set<Integer> expr(){
		ArrayList<Set<Integer>> nums = new ArrayList<Set<Integer>>();
		ArrayList<Character> ops = new ArrayList<Character>();
		while(p < input.length()){
			if(input.charAt(p) == '('){
				p++;
				nums.add(expr());
				p++;
			}
			else{
				nums.add(num());
			}
			if(p < input.length() && (input.charAt(p)=='+' || input.charAt(p)=='-' || input.charAt(p)=='*' || input.charAt(p)=='/')){
				ops.add(input.charAt(p++));
			}
			else{
				break;
			}
		}
		ArrayList< ArrayList<Set<Integer> > > memo = new ArrayList< ArrayList<Set<Integer> > >();
		for(int i=0; i<nums.size(); i++){
			memo.add(new ArrayList<Set<Integer> >());
			for(int j=0; j<nums.size(); j++){
				memo.get(i).add(null);
			}
		}
		Set<Integer> ret = rec(nums, ops, memo, 0, nums.size()-1);
		return ret;
	}

	Set<Integer> num(){
		int ret = input.charAt(p++) - '0';
		while(p < input.length() && Character.isDigit(input.charAt(p))){
			ret = ret*10 + input.charAt(p++) - '0';
		}
		Set<Integer> s = new HashSet<Integer>();
		s.add(ret);
		return s;
	}

	public static void main(String[] args){
		new Main().run();
	}
}