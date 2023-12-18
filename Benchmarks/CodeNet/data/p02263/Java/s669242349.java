import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Stack;
public class Main{
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		Pattern p = Pattern.compile("^[0-9]*$");
		String str = "";
		int sum=0;
		Matcher m = p.matcher(str);
		while(sc.hasNext()){
			str = sc.next();
			if(str.equals("+")){
				stack.push(stack.pop()+stack.pop());
			}
			else if(str.equals("-")){
				stack.push(stack.pop()-stack.pop());
			}
			else if(str.equals("*")){
				stack.push(stack.pop()*stack.pop());
			}
			else if(str.equals("/")){
				stack.push(stack.pop()/stack.pop());
			}
			else{
				System.out.println(str+": push now");
				stack.push(Integer.parseInt(str));
			}
		}
		System.out.println(stack.pop());
	}
}