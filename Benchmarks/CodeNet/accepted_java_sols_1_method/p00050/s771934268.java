import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		String str = sc.nextLine();
		String str2 = str.replace("apple", "P");
		str2 = str2.replace("peach", "apple");
		str2 = str2.replace("P", "peach");
		System.out.println(str2);

	}

}