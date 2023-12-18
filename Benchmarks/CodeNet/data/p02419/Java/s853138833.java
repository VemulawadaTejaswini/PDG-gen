import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine().toLowerCase();

		int count = 0;
		while(true) {

			String input = sc.nextLine();

			if(input.equals("END_OF_TEXT")) break;

			String tmp = input.toLowerCase();

			String[] tangos = tmp.split(" ");

			for(String tango : tangos) {
				if(tango.equals(word)) count++;
			}

		}
		sc.close();

		System.out.println(count);

	}
}