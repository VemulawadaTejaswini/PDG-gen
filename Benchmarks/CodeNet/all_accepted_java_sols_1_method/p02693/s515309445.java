import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K, A, B;

		K = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		int min, max, flg;

		min = A / K;
		max = B / K;
		flg = 0;

		for (int i = min; i <= max; i++) {
			if (K * i >= A && K * i <= B)
				flg = 1;
		}
		if(flg==1) System.out.println("OK");
		else System.out.println("NG");
	}
}
