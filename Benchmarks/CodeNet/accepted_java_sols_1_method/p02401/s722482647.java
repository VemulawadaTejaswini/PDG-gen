import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		String op;
		while(true){
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();

			if(op.indexOf("+") ==0) System.out.println(a+b);
			if(op.indexOf("-") ==0) System.out.println(a-b);
			if(op.indexOf("*") ==0) System.out.println(a*b);
			if(op.indexOf("/") ==0) System.out.println(a/b);
			if(op.indexOf("?") ==0) break;
		}
		
	}

}