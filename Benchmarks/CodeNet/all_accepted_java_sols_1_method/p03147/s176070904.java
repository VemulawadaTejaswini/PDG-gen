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

		int n        = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		int[] list   = new int[n];
		int ans    	 = 0;

		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(tmp[i]);
		}


		for(int i = 0; i < n; i++) {

			int r   = i;
			int min = Integer.MAX_VALUE;

			while(list[i] != 0) {
				while(r < n && list[r] != 0) {

					min = Math.min(min, list[r]);
					r++;
				}

				for(int k = i; k < r; k++) {

					list[k] -= min;
				}

				ans += min;
				r = i;
			}

		}

		System.out.println(ans);
	}
}
