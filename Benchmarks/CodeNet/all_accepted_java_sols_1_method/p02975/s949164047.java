import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		long ans = 0;
		for(int i = 0;i < N;i++) {
			ans = ans^A[i];
		}
		System.out.println(ans==0?"Yes":"No");
	}

}