import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();

		long sum = 0;
		long[] a = new long[n + 1];
		int i;
		for(i = 1; i <= n; i++) {
			long temp = (l + i - 1);
			sum += temp;
			a[i] = temp;
		}
		long min = Long.MAX_VALUE;
		int ans = 0;
		for(i = 1; i <= n; i++) {
			if(Math.abs(sum - (sum - a[i])) < min) {
				min = Math.abs(sum - (sum - a[i]));
				ans = i;
			}
		}

		System.out.println(sum - a[ans]);
	}
}
