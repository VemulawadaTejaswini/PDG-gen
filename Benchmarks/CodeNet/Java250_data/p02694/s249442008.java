import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();

		long deposit = 100L;
		int i =0;

		while(deposit < x) {
			deposit *= 1.01;
			i++;
		}
			System.out.println(i);

			scan.close();

	}

}
