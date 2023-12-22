import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main{		//スタック練習

	public static void main(String[] args) {

	BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		String toridasi="";
		StringTokenizer stk;
		int stacksize=0;
		Stack<Integer> st=new Stack<Integer>();

		try {
			str=bfr.readLine();
			stk=new StringTokenizer(str," ");
			stacksize=stk.countTokens();
			for(int i=0; i<stacksize; i++) {
				toridasi=stk.nextToken();

				if(toridasi.equals("+") || toridasi.equals("-") || toridasi.equals("*")) {
					int b=st.pop();
					int a=st.pop();
					if(toridasi.equals("+")) {
						st.push(a+b);
					}
					else if(toridasi.equals("-")) {
						st.push(a-b);
					}

					else if(toridasi.equals("*")) {
						st.push(a*b);
					}
				}
				else {
					st.push(Integer.parseInt(toridasi));
				}
			}
			System.out.println(st.pop());
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}

