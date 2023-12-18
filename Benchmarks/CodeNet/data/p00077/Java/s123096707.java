import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String str = sc.nextLine();
			run_length(str);
		}
	}

	private static void run_length(String str) {
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '@') {
				for (int j = 0; j < (str.charAt(i + 1) - '0'); j++) {
					System.out.print(str.charAt(i + 2));
				}
				i+= 2;
			} else {
				System.out.print(str.charAt(i));
			}

		}

		System.out.println();

	}

}
