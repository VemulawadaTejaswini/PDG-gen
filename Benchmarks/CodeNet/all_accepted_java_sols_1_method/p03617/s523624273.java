import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int H = sc.nextInt();
		int S = sc.nextInt();
		int D = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		//2L最安
		long s2 = Math.min(8*Q, 4*H);
		s2  = Math.min(s2, 2*S);
		s2 = Math.min(s2, D);
		//1L最安
		long s1 = Math.min(4*Q, 2*H);
		s1 = Math.min(s1, S);
		System.out.println((long)(N/2)*s2 + (long)(N%2)*s1);
	}
}