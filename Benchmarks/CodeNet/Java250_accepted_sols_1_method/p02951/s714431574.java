
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int A = 0;
		int B = 0;
		int C = 0;

		A = Integer.parseInt(lines[0]);//6
		B = Integer.parseInt(lines[1]);//4
		C = Integer.parseInt(lines[2]);//3

		C = B + C;

		if(A <= C) {
			C = C - A;
		}else {
			C = 0;
		}

		System.out.println(C);

	}

}
