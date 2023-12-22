
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int P = Integer.parseInt(lines[0]);
		int Q = Integer.parseInt(lines[1]);
		int R = Integer.parseInt(lines[2]);

		int min = P + Q + R - (int)Math.max(P, Math.max(Q, R));
		System.out.println(min);
	}

}
