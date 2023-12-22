import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//??????????????°

		int num1;
		int num2;
		int goukei;

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			num1 = scan.nextInt();
			num2 = scan.nextInt();

			goukei = num1 + num2;

			String keta = String.valueOf(goukei);

			System.out.println(keta.length());
		}
	}

}