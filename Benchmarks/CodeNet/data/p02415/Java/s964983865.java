import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int zzz=1;
		/*if (scan.next() == null) {
			zzz=0;
		}*/
		
		while (zzz==1) {

			/*if (scan.next() == null) {
				break;
			}*/

			String str;
			if ((str=scan.next()) == null) {
				zzz=0;
			}
			
			
			
			/*String str = scan.next();*/
			// strArry????????????????????????????´?
			String[] strArry = str.split("");

			for (int i = 0; i < strArry.length; i++) {

				// strArry[i]?????§??????????°??????????????????????
				// ??????????????????

				if (Character.isUpperCase(strArry[i].charAt(0))) {

					strArry[i] = strArry[i].toLowerCase();

					System.out.print(strArry[i]);

				} else {
					strArry[i] = strArry[i].toUpperCase();
					System.out.print(strArry[i]);
				}

			}

			System.out.print(" ");

		}

	}

}