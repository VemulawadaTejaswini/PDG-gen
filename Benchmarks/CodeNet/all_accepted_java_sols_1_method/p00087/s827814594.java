import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Stack<Double> stk=new Stack<>();
		
		while(in.hasNext()) {
			stk.clear();
			String d[]=in.nextLine().split(" ");
			for(int i=0;i<d.length;i++) {
				if(d[i].equals("+")) {
					double b=stk.pop(),a=stk.pop();
					stk.push(a+b);
				}
				else if(d[i].equals("*")) {
					double b=stk.pop(),a=stk.pop();
					stk.push(a*b);
				}
				else if(d[i].equals("-")) {
					double b=stk.pop(),a=stk.pop();
					stk.push(a-b);
				}
				else if(d[i].equals("/")) {
					double b=stk.pop(),a=stk.pop();
					stk.push(a/b);
				}
				else {
					stk.push(Double.parseDouble(d[i]));
				}
			}
			
			System.out.println(stk.pop());
		}
	}

}

