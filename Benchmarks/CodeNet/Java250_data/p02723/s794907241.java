import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char three = s.charAt(2);
		char four = s.charAt(3);
		char five = s.charAt(4);
		char six = s.charAt(5);

		boolean answer = false;
		if (three == four && five == six) {
			answer = true;
		}

		printBool(answer);
	}

    private static void printBool(boolean answer) {
        System.out.println(answer ?  "Yes" : "No");
    }
}