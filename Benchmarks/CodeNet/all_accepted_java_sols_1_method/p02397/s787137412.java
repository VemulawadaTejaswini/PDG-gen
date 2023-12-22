import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		while (true) {
			int numA = scan.nextInt();
			int numB = scan.nextInt();
			if (numA == 0 && numB == 0) {
				scan.close();
				text.deleteCharAt(text.lastIndexOf("\n"));
				System.out.println(text.toString());
				break;
			} else {
				if (numA <= numB)
					text.append(numA).append(" ").append(numB).append("\n");
				if (numA > numB)
					text.append(numB).append(" ").append(numA).append("\n");
			}
		}
	}

}