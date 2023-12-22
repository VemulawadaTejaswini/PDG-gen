import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int ans = 1;
		int twotimes = 0;
		int plus = 0;		
		for (int i = 0; i < N; i++) {
			twotimes = ans * 2;
			plus = ans + K;
			ans = twotimes < plus ? twotimes : plus;
			
		}
		System.out.println(ans);
	}

}