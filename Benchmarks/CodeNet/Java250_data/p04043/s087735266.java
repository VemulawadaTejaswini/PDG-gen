import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//整数を三つ受けとる

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		//
		String anser = "NO";

		Scanner scan = new Scanner(System.in);

         number1 = scan.nextInt();
         number2 = scan.nextInt();
         number3 = scan.nextInt();


		//処理開始
		if(checkFiveOrSeven(number1)) {
			if(checkFiveOrSeven(number2)) {
				if(checkFiveOrSeven(number3)) {
					if(number1 + number2 + number3 == 17) {
						anser = "YES";
					}
				}
			}

		}

		System.out.println(anser);

	}

	private static boolean checkFiveOrSeven(int number) {
		if(number ==5 || number == 7) {
			return true;
		}
		return false;
	}

}

