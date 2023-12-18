import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		long min = Long.MAX_VALUE;
		int diff = r - l;
		int start = l;
		int end = r;
		if (diff >= 2019) {
			for (int i = 0; i < 2019; i++) {
				if (min > (l + i) % 2019L) {
					start = l + i;
					min = (l + i) % 2019L;
				}
			}
			
			end = start + 2019;
		}
		
		min = Long.MAX_VALUE;
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				if (i == j) {
					continue;
				}
				long tmp = (i % 2019L * j % 2019L) % 2019;
				if (min > tmp) {
					min = tmp;
				}
			}
		}
		System.out.println(min);
	}
}
