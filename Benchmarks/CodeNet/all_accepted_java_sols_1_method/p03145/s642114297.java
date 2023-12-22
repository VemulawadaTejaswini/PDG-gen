import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int AB, BC, CA;
		Scanner sc = new Scanner(System.in);

		AB = sc.nextInt();
		BC = sc.nextInt();
		CA = sc.nextInt();

		System.out.println((AB * BC) / 2);

		sc.close();
	}

}