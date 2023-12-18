import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();

		if(b<a) {
			System.out.println(a-1);
		}
		else {
			System.out.println(a);
		}

		sc1.close();
	}

}
