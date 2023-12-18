import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		int a,b;

		a=kb.nextInt();
		b=kb.nextInt();

		System.out.printf( "%d %d %f\n", a/b, a%b, (double)a/b );	
	}
}