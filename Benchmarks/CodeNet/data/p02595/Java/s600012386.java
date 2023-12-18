import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int D = stdIn.nextInt();
		double X;
		double Y;
		int count = 0;
		for(int i = 0; i < N; i ++) {
			X = stdIn.nextDouble();
			Y = stdIn.nextDouble();
			if(Math.sqrt(X * X + Y * Y) <= D) {
				count ++;
			}
		}
		System.out.println(count);
	}
}