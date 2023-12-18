import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int c=0;
			while(true) {
				int a=scan.nextInt();
				String op=scan.next();
				int b=scan.nextInt();
			if(op.equals("+")) {
				c=a+b;
			}
			else if(op.equals("-")) {
				c=a-b;
			}
			else if(op.equals("*")) {
				c=a*b;
			}
			else if(op.equals("/")) {
				c=a/b;
			}
			else if(op.equals("?")) {
				break;
			}
			System.out.printf("%d\n",c);
			}
		scan.close();
}
}
