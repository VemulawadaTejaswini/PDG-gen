import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int A = Integer.parseInt(lines[0]);
		int P = Integer.parseInt(lines[1]);

		System.out.println((3 * A + P) / 2);
	}

}
