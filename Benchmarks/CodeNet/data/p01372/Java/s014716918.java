import java.util.*;

public class Main {
	String str;
	int pos;
	
	private TreeSet<Integer> solve(List<TreeSet<Integer>> list , List<Character> oplist){
		TreeSet<Integer> res = new TreeSet<Integer>();
		int len = list.size();
		if( len <= 1){
			return list.get(0);
		}
		for(int i = 1; i < len; i++){
			//(list) 0 to i , i to len 
			
			TreeSet<Integer> left = solve(list.subList(0, i), oplist.subList(0, i-1));
			TreeSet<Integer> right = solve(list.subList(i, len), oplist.subList(i, len-1));
			char nowOp = oplist.get(i-1);
			for(int l: left){
				for(int r: right){
					switch(nowOp){
					case '+':
						res.add(l + r);
						break;
					case '-':
						res.add(l - r);
						break;
					case '*':
						res.add(l * r);
						break;
					case '/':
						if(r != 0) {
							res.add(l / r);
						}
						break;
					default :
						//error
						int temp = 1/0;
					}
				}
			}
		}
		return res;
	}
		
	
	private TreeSet<Integer> exp() {
		//System.out.println(str);
		//char first = str.charAt(0);
		//int len = str.length();
//		if(first == '('){
//			String temp = str.substring(1,len-1);
//			return exp(temp);
//		}
		ArrayList<TreeSet<Integer>> al = new ArrayList<TreeSet<Integer>>();
		ArrayList<Character> oplist = new ArrayList<Character>();
		TreeSet<Integer> res = fact();
		al.add(res);
		while(true){
			char op = str.charAt(pos);
			if(op == '+'|| op == '-' ||op == '*'|| op == '/'){
				TreeSet<Integer> old = res;
				pos++;
				res = fact();
				al.add(res);
				oplist.add(op);
			}
			else break;
		}
		//calc

		return solve(al, oplist);
	}
	
	private TreeSet<Integer> fact() {
		TreeSet<Integer> res = new TreeSet<Integer>();
		if(Character.isDigit(str.charAt(pos))){
			int t = str.charAt(pos) - '0';
			pos++;
			while(Character.isDigit(str.charAt(pos))){
				t = t * 10 + (str.charAt(pos) - '0');
				pos++;
			}
			
			res.add(t);
			return res;
		}
		else if(str.charAt(pos) =='('){
			pos++;
			res = exp();
			pos++;
			return res;
		}
		return res;
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			str = sc.next() + "#";
			if(str.equals("##")) break;
			pos = 0;
			TreeSet<Integer> res = exp();
			//System.out.println(res);
			System.out.println(res.size());
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}