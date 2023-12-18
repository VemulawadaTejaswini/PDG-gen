import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
		int m        = Integer.parseInt(tmp[1]);
		String[] tem = scanner.nextLine().split(" ");
		int[] list   = new int[m];

		for(int i = 0; i < m; i++) {
			list[i] = Integer.parseInt(tem[i]);
		}

		Arrays.sort(list);
		Integer[] diff   = new Integer[m - 1];

		for(int i = m - 1; i > 0 ; i--) {
			diff[i - 1] = list[i] - list[i - 1];

		}

		Arrays.sort(diff, Comparator.reverseOrder());

		int ans = 0;
		for(int i = n - 1; i < m - 1; i++) {

			ans += diff[i];
		}

		System.out.println(ans);
	}
}
