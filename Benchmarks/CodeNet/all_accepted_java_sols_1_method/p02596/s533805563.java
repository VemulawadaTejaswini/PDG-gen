import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] a = new int[1000001];
		a[0] = 7 % k;
		for (int i = 1; i <= k; i++) {
			a[i] = (a[i-1] * 10 + 7) % k;
		}
		
		boolean flg = false;
		for (int i = 0; i < k; i++) {
			if (a[i] == 0) {
				System.out.println(i+1);
				flg = true;
				break;
			}
		}
		if (!flg) {
			System.out.println(-1);
		}
		
			
		
	}
}
