import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		if (sc.hasNext()) {
			words[i] = sc.nextLine();
		}
		Arrays.sort(words);
		System.out.println(words[0]);
	}
}