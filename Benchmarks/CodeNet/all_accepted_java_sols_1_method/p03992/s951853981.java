import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String str = sc.nextLine();
		str = str.substring(0, 4) + " " + str.substring(4);
		System.out.println(str);
	}
}
