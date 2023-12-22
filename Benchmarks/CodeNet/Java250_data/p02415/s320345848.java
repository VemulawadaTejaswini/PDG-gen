import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String[][] alphabet = new String[2][27];
		alphabet[0][0] = "a";

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strAry = str.split("");
		char charAry[] =str.toCharArray();
		for (int i = 0; i < strAry.length; i++) {
			if (Character.isUpperCase(charAry[i])) {
				strAry[i] = strAry[i].toLowerCase();
			} else if(Character.isLowerCase(charAry[i])) {
				strAry[i] = strAry[i].toUpperCase();
			}
			System.out.print(strAry[i]);
		}
		System.out.println("");
	}

}