import java.util.*;
public class Main {
	static int Eval(int a , String op , int b) {
		int result = op.equals("+") ? a+b
			: op.equals("-") ?  a-b
			: op.equals("*") ? a*b : a/b;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int in1 = sc.nextInt();
			String in2 = sc.next();
			int in3 = sc.nextInt();
			if ( in2.equals("?") ) break;
			System.out.println(Eval(in1,in2,in3));
		}
	}
}