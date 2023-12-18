import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long ans = 1;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			ans *= a[i];
		}
		
		if(ans > (long)(Math.pow(10, 18))) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}
