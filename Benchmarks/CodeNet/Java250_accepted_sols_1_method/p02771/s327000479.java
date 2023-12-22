import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String kn = "No";
		int i = kb.nextInt();
		int j = kb.nextInt();
		int k = kb.nextInt();
		if (i == j && j != k) {
			kn = "Yes";
		} else if (i == k && i != j) {
			kn = "Yes";
		} else if (j == k && k != i) {
			kn = "Yes";
		}

		System.out.println(kn);
		kb.close();
	}

}
