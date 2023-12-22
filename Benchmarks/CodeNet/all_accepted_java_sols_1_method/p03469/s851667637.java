import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		cin.close();

		System.out.println("2018" + str.substring(4));
	}

}
