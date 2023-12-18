import java.util.Scanner;

public class Main {
	public static final int[] coin = {500,100,50,10,5,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = 1000 - sc.nextInt();
			if (n==1000) {
				break;
			}
			int ans = 0;
			for(int i=0;i<coin.length;i++) {
				if (n>=coin[i]) {
					ans += n / coin[i];
					n -= coin[i] * (n/coin[i]);
				}
			}
			System.out.println(ans);
		}
	}
}