
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//お年玉問題
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int y=scan.nextInt();
		int value[]= {10000,5000,1000};
		int cnt[]= {-1,-1,-1};
		scan.close();
		int flg=0;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(n-i-j>=0) {
					if(value[0]*i+value[1]*j+value[2]*(n-i-j)==y) {
						flg=1;
						cnt[0]=i;
						cnt[1]=j;
						cnt[2]=n-i-j;
						break;
					}
				}
			}
			if(flg==1)break;
		}

		System.out.println(cnt[0]+" "+cnt[1]+" "+cnt[2]);
	}

}