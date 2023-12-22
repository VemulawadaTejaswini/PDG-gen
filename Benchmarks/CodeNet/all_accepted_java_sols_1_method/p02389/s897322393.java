import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	String  t = sc.next();
	int a = Integer.parseInt(t);
	String  y = sc.next();
	int b = Integer.parseInt(y);
	System.out.print( a * b );
	System.out.print( " " );
	System.out.println( a + a + b + b );
	}

}