import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price_list = new int[n];
		for(int i = 0; i < n; i++) {
			price_list[i] = sc.nextInt();
		}
		System.out.println(getMaxProfit(price_list));
		sc.close();
	}

	public static int getMaxProfit(int[] p) {
		int minv = p[0];
		int maxv = p[1] - p[0];
		for(int j = 1; j < p.length; j++) {
			if(maxv < p[j] - minv) {
				maxv = p[j] - minv;
			}
			if(minv > p[j]) {
				minv = p[j];
			}
		}
		return maxv;
	}
}
