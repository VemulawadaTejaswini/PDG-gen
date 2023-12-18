import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, len, start = -1, end = 0, depth = 0, horizon, count = 0;
		double sum = 0;
		String str;
		str = scan.next();
		len = str.length();
		int[] d = new int[len + 1];
		for (i = 0; i < len; i++) {
			switch (str.charAt(i)) {
				case '\\':
					if (start == -1) {
						start = i;
					}
					d[i] = depth;
					depth--;
					break;
				case '/':
					end = i;
					d[i] = depth;
					depth++;
					break;
				case '_':
					d[i] = depth;
					break;
				default:
					continue;
			}
		}
		d[len] = depth;
		if (d[start] > d[end + 1]) {
			horizon = d[end + 1];
		} else {
			horizon = d[start];
		}
		for (i = start; i < end + 1; i++) {
			if (d[i] > d[end + 1]) {
				continue;
			}
			switch (str.charAt(i)) {
				case '\\':
					sum += (horizon - d[i]) * 1 + 0.5;
					break;
				case '/':
					sum += (horizon - d[i + 1]) * 1 + 0.5;
					break;
				case '_':
					sum += (horizon - d[i]) * 1;
					break;
				default:
					continue;
			}
		}
		if (sum > 0) {
			count = 1;
		}
		System.out.printf("%.0f\n%d", sum,count);
		if(count>0) {
			System.out.printf(" %.0f\n",sum);
		}
		scan.close();
	}
}
