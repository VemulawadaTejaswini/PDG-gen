
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	

	void solve(){
		Scanner in = new Scanner(System.in);

		while(in.hasNext()){
			String s = in.nextLine();
			//int n = 0, m = 0;
			boolean flag = true;
			Stack<Integer> st = new Stack<Integer>();

			if(s.equals(".")) break;

			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == '(') st.push(1);
				else if(s.charAt(i) == '[') st.push(2);
				else if(s.charAt(i) == ')'){
					if(st.empty() || st.pop() == 2) {
						flag =false;
						break;
					}
				}
				else if(s.charAt(i) == ']'){
					if(st.empty() || st.pop() == 1){
						flag = false;
						break;
					}
				}
			}

			if(flag) System.out.println("yes");
			else System.out.println("no");
		}
		
	}
	

}