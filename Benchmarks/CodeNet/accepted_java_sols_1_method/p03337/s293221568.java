import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();

		int max = a + b;

		if(a-b > max) {
			max = a - b;
		}

		if ( a*b > max ){
			max = a * b;
		}

		System.out.println(max);

		sc1.close();
	}

}