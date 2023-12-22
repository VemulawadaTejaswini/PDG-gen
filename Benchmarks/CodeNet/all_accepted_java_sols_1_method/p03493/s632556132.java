import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		str = str.replace("0", "");
		System.out.println(str.length());
	}
}
