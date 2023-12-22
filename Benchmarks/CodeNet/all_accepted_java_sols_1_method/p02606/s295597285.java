import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int ans =0;
		for(int i=l;i<=r;i++) {
			if(i%d==0) {
				ans++;
			}
		}
		System.out.println(ans);


	}
}