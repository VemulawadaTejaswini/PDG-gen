import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char a[][] = new char[H][W];
		for (int i = 0 ; i < H ; i++) {
				String t = sc.next();
	            a[i] = t.toCharArray();
		}
		sc.close();

		int ans = 0;
		for (int h = 0; h < (Math.pow(2, H)); h++) {
			for (int w = 0; w < (Math.pow(2, W)); w++) {
				int count = 0;
				for (int j = 0; j < H; j++) {
					for (int k = 0; k < W; k++) {
						if((h>>j & 1)==1 && (w>>k&1)==1 && a[j][k]=='#') {
								count++;
						}
					}
				}
				if(count==K) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}
}