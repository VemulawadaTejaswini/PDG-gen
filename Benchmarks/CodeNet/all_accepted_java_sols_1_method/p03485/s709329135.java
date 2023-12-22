import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int  ab = a+b;
		int  x = ab/2;
		int  X = ab%2;
		int  C = x += X;
		
		System.out.println(C);

	}

}
