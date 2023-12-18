import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static int partition(int[] a, int p, int r) {
		int tmp = 0;

		int x = a[r];
		int i = p - 1;

			for(int j = 0; j < r; j++) {
				if (a[j] <= x) {
					i = i + 1;
					tmp =a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}

		tmp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = tmp;

		return i + 1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(new InputStreamReader(System.in));

		int matrixLength = scan.nextInt();

		int[] a = new int[matrixLength];

		for(int i = 0; i < matrixLength; i++) {
			a[i] = scan.nextInt();
		}

		int targetIndex = partition(a, 0, a[matrixLength - 1]);

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < a.length; i++) {
			if(i == targetIndex){
				sb.append("[");
				sb.append(a[i]);
				sb.append("]");
			} else {
				sb.append(a[i]);
			}

			if(i == a.length - 1){
				break;
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
		scan.close();
	}
}