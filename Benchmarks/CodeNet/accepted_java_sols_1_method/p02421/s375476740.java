
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intTarouPoint = 0;
		int intHanakoPoint = 0;

		int intTurn = sc.nextInt();
		for(int i = 0; i < intTurn; i++) {
			String strTarouCard = sc.next();
			String strHanakoCard = sc.next();
			if(0 < strTarouCard.compareTo(strHanakoCard)) {
				intTarouPoint++;
				intTarouPoint++;
				intTarouPoint++;
			}
			else if(0 == strTarouCard.compareTo(strHanakoCard)) {
				intTarouPoint++;
				intHanakoPoint++;
			}
			else {
				intHanakoPoint++;
				intHanakoPoint++;
				intHanakoPoint++;
			}

		}
		System.out.printf("%d %d%n",intTarouPoint, intHanakoPoint);
	}
}