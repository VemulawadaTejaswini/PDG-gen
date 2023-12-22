import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] NList = new long[N+1];
		NList[0] = 2;
		NList[1] = 1;
		for (int i=2 ; i <=  N; i++) {
			NList[i] = NList[i-2] + NList[i-1];
		}
		System.out.println(NList[N]);

	}
}
