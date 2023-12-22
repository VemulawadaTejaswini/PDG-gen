import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int count = 0;
		int ans = 1;
		for(int i=1;i<=n;i++){
			int count1 = 0;
			int tmp = i;
			while(tmp%2==0) {
				tmp = tmp/2;
				count1 = count1+1;
			}
			if(count1>count) {
				count = count1;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}