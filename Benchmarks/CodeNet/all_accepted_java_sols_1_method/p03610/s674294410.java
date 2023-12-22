import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer s = new StringBuffer(scanner.next());
		StringBuffer result = new StringBuffer("");

		for (int i = 0; i < s.length(); i += 2) {
			result.append(s.substring(i, i+1));
		}
		System.out.println(result);
	}

}