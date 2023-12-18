import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int num[] = new int[10];
		int max = 0;
		int min = 0;
		String str = "YES";

		for (int s = 0; s < n; s++) {
			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
			}
			max=num[0];
			for (int i = 1; i < 10; i++) {
				max=Math.max(max, min);
				min=Math.min(max, min);
				if (max < num[i] ) {
					max = num[i];
				} else if (min < num[i]) {
					min = num[i];
				} else {
					str = "NO";
					break;
				}
			}
			System.out.println(str);

		}

	}

}