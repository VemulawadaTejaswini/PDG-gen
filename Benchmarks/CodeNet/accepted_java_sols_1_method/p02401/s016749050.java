import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String op;
		int a,b;
		while(true){
			a=scan.nextInt();
			op=scan.next();
			b=scan.nextInt();
			if(op.equals("?")) break;
			else if(op.equals("+")) System.out.println(a+b);
			else if(op.equals("-")) System.out.println(a-b);
			else if(op.equals("*")) System.out.println(a*b);
			else System.out.println(a/b);
		}
		scan.close();
	}
}