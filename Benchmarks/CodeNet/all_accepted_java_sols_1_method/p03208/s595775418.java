import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		int k        = Integer.parseInt(tmp[1]);
		int[] list   = new int[n];
		int count    = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(scanner.nextLine());
		}

		Arrays.parallelSort(list);

		for(int i = 0; i < n - k + 1; i++) {

			count = Math.min(Math.abs(list[i] - list[i + k - 1]), count);

		}

		System.out.println(count);

	}
}
