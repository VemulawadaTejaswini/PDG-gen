import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int len = sc.nextInt();
			int size = sc.nextInt();
			int max = 0;
			int maxAt = 0;
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}
			if (len == size) {
				int temp = 0;
				for (int i = 0; i < size; i++) {
					temp += arr[i] + 1;
				}
				System.out.print(new BigDecimal(temp).divide(new BigDecimal(2), 1, 3));
				return;
			}
			for (int i = 0; i < size; i++) {
				max += arr[i];
			}
			int tempMax = max;
			int left = len - size;
			for (int i = 0; i < left; i++) {
				tempMax -= arr[i];
				tempMax += arr[i + size];
				if (tempMax > max) {
					maxAt = i;
					max = tempMax;
				}
			}
			int temp = 0;
			for (int i = 0; i < size; i++) {
				temp += arr[maxAt + i + 1] + 1;
			}
			System.out.print(new BigDecimal(temp).divide(new BigDecimal(2), 1, 3));
		}
	}
}