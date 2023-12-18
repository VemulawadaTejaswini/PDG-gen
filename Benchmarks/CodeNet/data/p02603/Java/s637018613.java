import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int hako[] = new int[k];
		long ans=1000;//手持ち
		int kabu=0;//株

		for(int i=0;i<k;i++) {
			hako[i] = sc.nextInt();
		}

		for(int day=0;day<k-1;day++) {
			kabu+=ans/hako[day];
			ans%=hako[day];
			/*株持ってる時*/
			if(hako[day]>hako[day+1]){
				/*計算開始*/
				ans+=hako[day]*kabu;
				kabu=0;
				/*終了*/
			}
		}
		ans+=hako[k-1]*kabu;//念のための株売却
		System.out.println(ans);
	}
}
