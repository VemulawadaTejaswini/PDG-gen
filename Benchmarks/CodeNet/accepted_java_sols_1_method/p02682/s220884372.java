import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long plusCardNum = Long.parseLong(sc.next());
		long zeroCardNum = Long.parseLong(sc.next());
		long minusCardNum = Long.parseLong(sc.next());
		long chooseCardNum = Long.parseLong(sc.next());

		//
		if (chooseCardNum <= plusCardNum) {
			System.out.println(chooseCardNum);
		} else if (chooseCardNum <= plusCardNum + zeroCardNum) {
			System.out.println(plusCardNum);
		} else {
			System.out.println(plusCardNum - (chooseCardNum - plusCardNum - zeroCardNum));
		}

	}

}
