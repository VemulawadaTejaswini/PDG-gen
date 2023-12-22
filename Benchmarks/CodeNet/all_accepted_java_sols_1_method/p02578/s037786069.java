import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		int temp = 0;
		long totalStandHeight = 0;
		for (int i = 0; i < n; i++) {

			if (temp > height[i]) {
				totalStandHeight += temp - height[i];
			} else if (temp < height[i]) {
				temp = height[i];
			}

		}

		System.out.println(totalStandHeight);

		sc.close();

	}

}
