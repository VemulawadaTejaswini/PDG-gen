import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int ans = 0;
		int y = 0;
		for(int i = 0;i < n - 1;i ++) { //ユークリッド
			y = sc.nextInt();
			if(x > y) {
				while(y != 0) {
					ans = x % y;
					x = y;
					y = ans;
				}
			} else {
				while(x != 0) {
					ans = y % x;
					y = x;
					x = ans;
				}
				x = y;
			}
		}
		System.out.println(x);
	}
}