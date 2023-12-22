import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		List<String> lines1 = Arrays.asList(line1.split(" "));

		if (lines1.get(0).equals(lines1.get(1))) {
			System.out.println("Draw");
			return;
		}else if (lines1.get(0).equals("1")) {
			System.out.println("Alice");
			return;
		}else if (lines1.get(1).equals("1")) {
			System.out.println("Bob");
			return;
		}else {
			Integer a = Integer.parseInt(lines1.get(0));
			Integer b = Integer.parseInt(lines1.get(1));
			if(a > b) {
				System.out.println("Alice");
				return;
			}else {
				System.out.println("Bob");
				return;
			}
		}
	}

}