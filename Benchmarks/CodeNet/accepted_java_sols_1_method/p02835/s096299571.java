import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();

		if(a+a1+a2 >= 22) {
			System.out.println("bust");
		}
		else {
			System.out.println("win");
		}
		sc.close();
	}

}
