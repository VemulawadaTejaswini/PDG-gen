import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if(N%2==0) {
			System.out.println(N/2);
		}else {
			System.out.println(N/2+1);
		}
	}
}
