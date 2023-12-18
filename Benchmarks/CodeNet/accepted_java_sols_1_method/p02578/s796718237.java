import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long count = 0;
		for(int i = 1; i < n; i++) {
			long s = a[i-1] - a[i];
			if(s > 0) {
				a[i] += s;
				count += s;
			}
		}

		System.out.println(count);
	}

}
