import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int x = sca.nextInt();
		final int onigiri = 100;
		final int sandich = 101;
		final int cooky = 102;
		final int cake = 103;
		final int ame = 104;
		final int pc = 105;
		int max = 100000;
		for(int i = 0; i <= x/pc; i++) {
			for(int j = 0; j <= (x-pc*i)/ame; j++) {
				for(int k = 0; k <= (x-pc*i-ame*j)/cake; k++) {
					for(int l = 0; l <= (x-pc*i-ame*j-cake*k)/cooky; l++) {
						for(int m = 0; m <= (x-pc*i-ame*j-cake*k-cooky*l)/sandich; m++) {
							for(int n = 0; n <= (x-pc*i-ame*j-cake*k-cooky*l-sandich*m)/onigiri; n++) {
								if(x == n*onigiri + m*sandich + l*cooky + k*cake + j*ame + i*pc) {
									System.out.println(1);
									return;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(0);
	}
}
