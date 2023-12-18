import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int K = sc.nextInt();
			if (K % 2 == 0) {
				System.out.println(-1);
				return;
			}
			boolean[] bls = new boolean[K];
			int idx = 1;
			int sevenAmari = 7 % K;
			int tempAmari = 0;
			while (true) {
				tempAmari += sevenAmari;
				tempAmari %= K;
				if (tempAmari == 0) {
					break;
				}
				if (bls[tempAmari]) {
					System.out.println(-1);
					return;
				}
				bls[tempAmari] = true;
				idx++;
				sevenAmari *= 10;
				sevenAmari %= K;
			}
			System.out.println(idx);
		}
	}
}