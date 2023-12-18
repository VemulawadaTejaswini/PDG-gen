import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.valueOf(scan.nextLine());
		while (N-- > 0) {
			String[] data = scan.nextLine().split(" ", 0);
			int num[] = new int[3];
			for (int i = 0; i < 3; i++) {
				num[i] = Integer.parseInt(data[i]);
			}
			num = sortInteger(num);
			if (Math.pow(num[0], 2) == Math.pow(num[1], 2) + Math.pow(num[2], 2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	public static int[] sortInteger(int[] num) {
		int len = num.length;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		return num;
	}
}