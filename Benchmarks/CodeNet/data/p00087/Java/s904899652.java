import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNextLine()){
			Stack<Double> st=new Stack<Double>();
			String[] strs=sc.nextLine().split(" ");
			for(String str:strs){
				if("+".equals(str)){
					double op2=st.pop(),op1=st.pop();
					st.push(op1+op2);
				}else if("-".equals(str)){
					double op2=st.pop(),op1=st.pop();
					st.push(op1-op2);
				}else if("*".equals(str)){
					double op2=st.pop(),op1=st.pop();
					st.push(op1*op2);
				}else if("/".equals(str)){
					double op2=st.pop(),op1=st.pop();
					st.push(op1/op2);
				}else{
					st.push(Double.parseDouble(str));
				}
			}
			ln(st.pop());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}