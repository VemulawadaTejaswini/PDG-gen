import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
		if (a > b) {
			if (b > c) {
				System.out.println( c + " " + b + " " + a );
			} if (a < c) {
				System.out.println( b + " " + a + " " + c );
			} if (a > c) { if (b < c) {
				System.out.println( b + " " + c + " " + a );
			}}
		} if (a < b) {
			if (b < c) {
				System.out.println( c + " " + a + " " + b );
			} if (a > c) {
				System.out.println( c + " " + a + " " + b );
			} if (a < c) { if (b > c) {
				System.out.println( a + " " + c + " " + b );
			}}
		}
		
	}
}