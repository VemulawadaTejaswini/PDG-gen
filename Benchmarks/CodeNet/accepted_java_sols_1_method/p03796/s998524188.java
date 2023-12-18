import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long ans = 1;
		for(int i=1;i<=n;i++) {
			ans = (long) (ans * i%(Math.pow(10, 9)+7));
		}
		System.out.println(ans);
	}

}
