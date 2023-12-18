
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			str = str.replaceAll("apple", "peach");
			System.out.println(str);
		}
	}
}
