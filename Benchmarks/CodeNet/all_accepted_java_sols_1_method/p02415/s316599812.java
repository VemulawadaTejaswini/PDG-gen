import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int i;

			String str = sc.nextLine();

			char chArray[] = new char[str.length()];

			for(i = 0; i < str.length(); i++) {

				chArray[i] = str.charAt(i);

			}

			for(i = 0; i < str.length(); i++) {

				if(Character.isUpperCase(chArray[i])) {

					chArray[i] = Character.toLowerCase(chArray[i]);

				} else if(Character.isLowerCase(chArray[i])) {

					chArray[i] = Character.toUpperCase(chArray[i]);

				}

			}

			for(i = 0; i < str.length(); i++) {

				System.out.print(chArray[i]);

			}
			System.out.println();

	}
}