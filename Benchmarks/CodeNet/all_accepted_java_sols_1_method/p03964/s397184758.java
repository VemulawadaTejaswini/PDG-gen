import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		long A = 1;
		long B = 1;
		for(int i = 0; i < N; i++){
			long x = scan.nextInt();
			long y = scan.nextInt();
			long n = Math.max((A+x-1)/x,(B+y-1)/y);
			A = n * x;
			B = n * y;
		}
		System.out.println(A+B);
	}
}
