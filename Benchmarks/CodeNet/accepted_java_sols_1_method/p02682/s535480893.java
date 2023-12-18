import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int ak = Math.min(K, A);
		K -= ak;
		int bk = Math.min(K, B);
		K -= bk;
		int ck = K;
		System.out.println(ak - ck);
		sc.close();
	}
}