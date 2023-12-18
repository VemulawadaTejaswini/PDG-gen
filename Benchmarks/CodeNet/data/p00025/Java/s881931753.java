import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A[] = new int[4];
		int B[] = new int[4];

		for (int i = 0; i < 4; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			B[i] = sc.nextInt();
		}
		System.out.println(hitandblow(A, B));
	}

		static String hitandblow(int a[], int b[]) {
			int hit = 0;
			int hblow = 0;
			int blow = 0;
			String result = "";
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i]) {
					hit++;
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (a[i] == b[j]) {
						hblow++;
					}
				}
			}
			

			result = hit + " " + hblow;

			return result;
		}
}