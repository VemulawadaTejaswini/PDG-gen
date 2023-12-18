import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ma,mi;
		long sum=0;
		int a[] = new int[n];

		for(i=0; i<n; i++) {
			int num = sc.nextInt();
			a[i] = num;
		}

		ma = mi = a[0];

		for(i=1; i<n; i++) {
			if(ma < a[i]) {
				ma = a[i];
			}
		}

		for(i=1; i<n; i++) {
			if(mi > a[i]) {
				mi = a[i];
			}
		}

		for(i=0; i<n; i++) {
			sum += a[i];
		}

		System.out.println(String.format("%d %d %d",mi,ma,sum));
	}

}

