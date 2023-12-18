import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final var scanner = new Scanner(System.in);
		final var age = scanner.nextInt();
		final var charge = scanner.nextInt();
		var modifiedCharge = 0;
		if(age >= 13) {
			modifiedCharge = charge;
		}else if (age >= 6) {
			modifiedCharge = charge /2;
		}else {
		}
		System.out.println(modifiedCharge);
		scanner.close();
	}

}
