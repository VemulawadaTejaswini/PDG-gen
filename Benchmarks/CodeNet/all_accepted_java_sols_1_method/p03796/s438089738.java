import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long p = 1;
		for(int i = 1; i <= N; i++) {
			p = p % 1000000007 * i;
		}
		System.out.println(p % 1000000007);
	}

}
