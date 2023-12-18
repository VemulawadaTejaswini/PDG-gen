import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		// int[] A = Arrays.stream(sc.nextLine().split("
		// ")).mapToInt(Integer::parseInt).toArray();

		int[] A = new int[N];

		for (int k = 0; k < N; k++) {
			A[k] = Integer.parseInt(sc.next());
		}

		int tmp;
		int i = 0;
		int count = 0;

		boolean flag = true;

		while (flag) {
			flag = false;
			for (int j = N - 1; j > i; j--) {
				if (A[j - 1] > A[j]) {
					tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
					flag = true;
					count++;
				}	
			}
			i++;
		}

		out_put(A);

		System.out.println(count);

		sc.close();
	}

	private static void out_put(int array[]) {

		System.out.printf("%d", array[0]);

		for (int i = 1; i < array.length; i++) {
			System.out.printf(" %d", array[i]);
		}
		System.out.printf("\n");
	}
}

