import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		int T = in.nextInt();

		int before = 0;
		long n = 0, sum = 0;

		for(int i = 0; i < N; i++){
			int t = in.nextInt();
			if(t - before > T){
				n += (t - before) - T;
			}
			sum += t;
			before = t;
		}
		System.out.println(before - n + T);

	}
}
