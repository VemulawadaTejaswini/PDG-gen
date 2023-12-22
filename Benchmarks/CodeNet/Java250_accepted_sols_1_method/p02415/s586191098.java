import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		sc.close();

		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.split("")[i].toLowerCase());
			} else {
				System.out.print(str.split("")[i].toUpperCase());
			}
		}
		System.out.println("");

	}

}

