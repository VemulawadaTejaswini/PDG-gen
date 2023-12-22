import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intInput = scan.nextInt();
		int intSec = intInput % 60;
		int intMin = (intInput - intSec)/60;
		int intHour = intMin / 60;
		intMin = intMin - intHour * 60;
		System.out.println(intHour + ":" + intMin + ":" + intSec);
	}
}