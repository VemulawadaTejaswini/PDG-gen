import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		String str[]=in.nextLine().split(" ");
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<str.length;i++){
			try{
				int a=Integer.parseInt(str[i]);
				st.push(a);
			}catch(Exception e){
				if(str[i].equals("+")){
					int a=st.pop();
					int b=st.pop();
					st.push(a+b);
				}else if(str[i].equals("-")){

					int a=st.pop();
					int b=st.pop();
					st.push(b-a);
				}else{
					int a=st.pop();
					int b=st.pop();
					st.push(a*b);
				}
			}
		}
		out.println(st.pop());
	}

}
