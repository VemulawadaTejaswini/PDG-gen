import java.util.Scanner;

public class Main {

	final static int MAX = 24 * 60 * 60;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			
			int[] count = new int[MAX];
			int	max = 0;
			
			for (int i = 0; i < n; i++) {
				String[] st = sc.next().split(":");
				String[] en = sc.next().split(":");

				final int start = Integer.parseInt(st[0]) * 60 * 60
						+ Integer.parseInt(st[1]) * 60
						+ Integer.parseInt(st[2]);
				final int end = Integer.parseInt(en[0]) * 60 * 60
						+ Integer.parseInt(en[1]) * 60
						+ Integer.parseInt(en[2]);
				
				for(int j = start; j < end; j++){
					count[j]++;
					max = Math.max(max, count[j]);
				}
			}
			
			System.out.println(max);

		}

	}

}