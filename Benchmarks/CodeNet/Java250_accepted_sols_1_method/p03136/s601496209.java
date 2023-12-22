import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] L = new int[N];

		int iMax = 0;
		int sum = 0;
		for (int i = 0; i < L.length; i++) {
			L[i] = sc.nextInt();
			sum += L[i];
			if (L[iMax] < L[i]) {
				iMax = i;
			}
		}

		System.out.println(L[iMax] < sum - L[iMax] ? "Yes" : "No");

		sc.close();
	}

}


