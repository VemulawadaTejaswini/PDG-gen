import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		String[] strings = string.split(" ");

		System.out.println(strings[0].substring(0, 1) + strings[1].substring(0, 1) + strings[2].substring(0, 1));
	}

}
