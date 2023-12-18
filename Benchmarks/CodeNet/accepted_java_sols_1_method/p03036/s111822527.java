
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int r = Integer.parseInt(lines[0]);
		int D = Integer.parseInt(lines[1]);
		int x_2000 = Integer.parseInt(lines[2]);

		for(int i = 0; i < 10; i++) {
			x_2000 = r * x_2000 - D;
			System.out.println(x_2000);
		}
	}

}
