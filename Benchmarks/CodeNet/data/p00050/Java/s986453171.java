
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			str = str.replaceAll("apple", "1");
			str = str.replaceAll("peach", "2");
			str = str.replaceAll("1", "peach");
			str = str.replaceAll("2", "apple");
			System.out.println(str);
		}
	}
}
