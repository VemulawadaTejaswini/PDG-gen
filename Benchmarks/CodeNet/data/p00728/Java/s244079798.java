import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int point = 0;
			for (int i = 0; i < n; i++) {
				int judge = in.nextInt();
				max = Math.max(max, judge);
				min = Math.min(min, judge);
				point += judge;
			}
			point -= max + min;
			System.out.println(point / n);
		}
	}

}