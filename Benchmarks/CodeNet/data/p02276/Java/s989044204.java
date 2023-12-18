import java.util.Scanner;
import java.util.StringJoiner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int point = partition(arr, 0, n-1);

		StringJoiner sj = new StringJoiner(" ");
		for (int i = 0; i < n; i++) {
			String val = String.valueOf(arr[i]);
			if(i == point) val = "[" + val + "]";
			sj.add(val);
		}

		System.out.println(sj);

	}

	private static int partition(int[] arr, int p, int r) {

		int x = arr[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				i++;
				int tmp;
				tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
		}

		int tmp;
		tmp = arr[r];
		arr[r] = arr[i+1];
		arr[i+1] = tmp;

		return i + 1;

	}
}