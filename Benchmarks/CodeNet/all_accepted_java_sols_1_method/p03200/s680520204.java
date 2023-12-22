import java.util.Scanner;
public class Main {
	public static int[] qlist;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		char[] k = sc.next().toCharArray();
		int n = 0;
		int bcnt = 0;
		long c = 0;
		while(n < k.length - 1) {
			if(k[n] == 'B') {
				bcnt++;
			}
			else if(k[n] == 'W') {
				bcnt = 0;
			}
			if(k[n] == 'B' && k[n + 1] == 'W') {
				k[n] = 'W';
				k[n + 1] = 'B';
				c += bcnt;
				if(bcnt >= 2) {
					bcnt --;
				}
				else {
					bcnt = 0;
				}
			}
			n++;
		}
		System.out.println(c);
	}
}