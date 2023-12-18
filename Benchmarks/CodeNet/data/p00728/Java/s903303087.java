import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int n = sc.nextInt();

			if(n == 0) {
				break;
			}
			List<Integer> a = new ArrayList<>();
			int sum = 0;
			int max = 0;
			int min = 1000;
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				a.add(x);
				sum += x;
				if(max < x) {
					max = x;
				}
				if(min > x) {
					min = x;
				}
			}
			sum -= max;
			sum -= min;

			int ans = sum/(n-2);

			System.out.println(ans);
		}

	}

}
