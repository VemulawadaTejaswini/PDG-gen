import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		Stack<Integer>stk=new Stack<>();
		
		while(cin.hasNext()) {
			String obj=cin.next();
			
			Pattern p=Pattern.compile("^[0-9]*$");
			Matcher m=p.matcher(obj);
			if(m.find()) {
				stk.push(Integer.valueOf(obj));
			}
			else {
				if(obj.equals("+")) {
					int sum=0;
					for(int i=0;i<2;i++) {
						sum+=stk.peek();
						stk.pop();
					}
					stk.push(sum);
				}
				else if(obj.equals("-")) {
					int sum=stk.peek();stk.pop();
					sum=stk.peek()-sum;stk.pop();
					stk.push(sum);
				}
				else if(obj.equals("*")) {
					int sum=1;
					for(int i=0;i<2;i++) {
						sum*=stk.peek();
						stk.pop();
					}
					stk.push(sum);
				}
			}
			
		}
		System.out.println(stk.peek());
		
	}

}

