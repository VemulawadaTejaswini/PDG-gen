
import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int x;

		String s= sc.nextLine();
		String num[] = s.split(" ");

		Stack<Integer> st = new Stack<Integer>();

		for (int i=0;i<num.length;++i){
			if(num[i].equals("+")==true){
				x=st.pop()+st.pop();
				st.push(x);
			}
			else if(num[i].equals("-")==true){
				x=-st.pop()+st.pop();
				st.push(x);
			}
			else if(num[i].equals("*")==true){
				x=st.pop()*st.pop();
				st.push(x);
			}
			else st.push(Integer.valueOf(num[i]));
		}

		System.out.println(st.pop());


	}
}
