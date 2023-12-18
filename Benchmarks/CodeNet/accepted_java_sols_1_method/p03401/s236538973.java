import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+2];
		a[0] = 0;
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		a[n+1] = 0;

		// 全ルートの計算
		int sum = 0;
		int pos = 0;
		for(int i = 0; i <= n; i++) {
			sum += Math.abs(pos - a[i]);
			pos = a[i];
		}
		sum += Math.abs(pos);

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			int sum2 = sum;
			if( (a[i] - a[i - 1]) >= 0 && ((a[i+1] - a[i]) >= 0) || (a[i] - a[i - 1]) <= 0 && ((a[i+1] - a[i]) <= 0) ) {
				sb.append(sum2);
				sb.append("\n");
				continue;
			}
			sum2 -= Math.abs(a[i - 1] - a[i]);
			sum2 -= Math.abs(a[i] - a[i + 1]);
			sum2 += Math.abs(a[i - 1] - a[i+1]);
			sb.append(sum2);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
