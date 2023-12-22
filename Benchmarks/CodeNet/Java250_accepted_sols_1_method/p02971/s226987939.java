import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] arr = new int[n];

		int maxAll = 0;
		int maxIndex = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
			if (arr[i] > maxAll) {
				maxAll = arr[i];
				maxIndex = i;
			}
		}

		for (int i = 0; i < n; i++) {
			if (i != maxIndex) {
				System.out.println(maxAll);
			} else {
				int max = 0;
				for (int j = 0; j < n; j++) {
					if(j==i)continue;
					if(max < arr[j]) {
						max = arr[j];
					}
				}
				System.out.println(max);
			}
		}
	}
}