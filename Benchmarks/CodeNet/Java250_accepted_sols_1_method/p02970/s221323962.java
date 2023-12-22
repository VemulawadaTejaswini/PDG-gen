
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int N = Integer.parseInt(lines[0]);
		int D = Integer.parseInt(lines[1]);

		int num = 2*D + 1;
		int ans = N / num;
		if(N % num == 0) {
			System.out.println(ans);
		}else {
			System.out.println(ans + 1);
		}
	}

}
