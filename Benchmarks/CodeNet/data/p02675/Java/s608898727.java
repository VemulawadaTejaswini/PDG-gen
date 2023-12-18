import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
	public static void main() {
		prob(System.in, System.out);
	}

	public static void prob(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);
		String line = sc.nextLine();
		int num = Integer.valueOf(line);
		int one = num % 10;
		if (one == 3) {
			out.println("bon");
		} else if (one == 0 || one == 1 || one == 6 || one == 8) {
			out.println("pon");
		} else {
			out.println("hon");
		}

	}


	public static void prob2(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);
		String line = sc.nextLine();

		char max = 'z';
		char min = 'a';
		String[] charlist = new String[max - min + 1];
		for (char i = 'a'; i <= max; i++) {
			charlist[i] = String.valueOf(i);
		}

		for (int i = 0; i < charlist.length; i++) {
			if (!line.contains(charlist[i])) {
				charlist[i] = "";
			}
		}

		int sum = 0;
		for (int i = 0; i < charlist.length; i++) {
			if (!charlist[i].isEmpty()) {
				sum++;
			}
		}

		String[] usedChars = new String[sum];
		int j = 0;
		for (int i = 0; i < charlist.length; i++) {
			if (!charlist[i].isEmpty()) {
				usedChars[j] = charlist[i];
				j++;
			}
		}



	}
}