import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		long sum = 0;
		long cnt1 = 0;
		long cnt2 = 0;
		long flg = 1;
		for(int i = 0;i < n;i++) {
			sum += a[i];
			if(sum * flg <= 0) {
				cnt1 += Math.abs(sum) + 1;
				sum = flg;
			}
			flg *= -1;
		}
		flg = -1;
		sum = 0;
		for(int i = 0;i < n;i++) {
			sum += a[i];
			if(sum * flg <= 0) {
				cnt2 += Math.abs(sum) + 1;
				sum = flg;
			}
			flg *= -1;
		}
		System.out.println(Math.min(cnt1,cnt2));
	}
}