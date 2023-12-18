import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int a = in.nextInt();
			String op = in.next();
			if(op.equals("?")) break;
			int b = in.nextInt();
			int ans = 0;
			if(op.equals("+")) ans = a+b;
			else if(op.equals("-")) ans = a-b;
			else if(op.equals("*")) ans = a*b;
			else if(op.equals("/")) ans = a/b;
			System.out.println(ans);
		}
	}
}