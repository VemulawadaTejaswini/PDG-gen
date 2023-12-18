import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] x = line.split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);
		int count = 0;
		a -= 1;
		while (a  < b) {
			a++;

			if (c % a == 0) {
				count += 1;

			}

		}

		System.out.println(count);

	}

}

