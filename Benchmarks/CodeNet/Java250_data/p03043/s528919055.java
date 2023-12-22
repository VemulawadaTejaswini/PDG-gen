
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		double ans = 0;
		for(int i = 1; i < N+1; i++) {
			int count = 1;
			while(K > i*count) {
				count *= 2;
			}
			ans += 1/(double)count;
		}
		System.out.println(ans / N);
	}

}
