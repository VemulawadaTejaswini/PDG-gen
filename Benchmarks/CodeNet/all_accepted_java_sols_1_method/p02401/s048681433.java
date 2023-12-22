import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int a=i.nextInt();
		String op=i.next();
		int b=i.nextInt();
		while (op.equals("?")==false){
			if(op.equals("+")) System.out.println(a+b);
			else if(op.equals("-"))System.out.println(a-b);
			else if(op.equals("*"))System.out.println(a*b);
			else if(op.equals("/"))System.out.println(a/b);
			a=i.nextInt();
			op=i.next();
			b=i.nextInt();
		}
	}
}