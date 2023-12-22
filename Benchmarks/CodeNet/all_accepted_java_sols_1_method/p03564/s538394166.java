import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int origin = 1;
		for(int i = 0;i < N;i++) {
			origin = Math.min(origin*2, origin+K);
		}
		System.out.println(origin);
	}

}