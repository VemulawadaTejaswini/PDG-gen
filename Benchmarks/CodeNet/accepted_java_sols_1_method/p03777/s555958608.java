import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] inputs = new Scanner(System.in).nextLine().split(" ");
		String a = inputs[0];
		String b = inputs[1];
		
		if (a.equals("H")) {
			System.out.println(b);
		}
		else {
			System.out.println((b.equals("H") ? "D" : "H"));
		}
	}

}