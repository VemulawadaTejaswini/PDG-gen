import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

       		String inputString = scanner.nextLine();

		String[] strStdIn = inputString.split(" ", 0);

		String name = null;

		if (strStdIn[1].length() == 1)  {
			name = strStdIn[1];
		} else {
			name = strStdIn[1].substring(0, 1);
		}

		System.out.println("A" + name + "C");
	}
}