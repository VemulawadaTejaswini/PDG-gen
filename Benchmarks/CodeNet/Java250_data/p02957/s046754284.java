
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		long A = Long.parseLong(lines[0]);
		long B = Long.parseLong(lines[1]);

		if((A + B) % 2 == 0) {
			System.out.println((A + B) / 2);
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
