import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);

		int intNum = scan.nextInt();

		int intH = (intNum/60)/60;

		int intNum2 = intNum - intH * 60 * 60;

		//System.out.println("intNum2: " + intNum2);

		int intM = intNum2/60;

		int intS = intNum2 - intM * 60;



		System.out.println(intH + ":" + intM + ":" + intS);




	}

}