import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int tmp=n;
		while(tmp>0) {
			tmp = tmp -1000;
		}
		System.out.println(-1*tmp);

	}
}