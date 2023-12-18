import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[256];
		for (int i = 0; i < 256; i++) {
			count[i] = 0;
		}
		while (sc.hasNext()) {
			String x = sc.nextLine();
			for (int i = 0; i < x.length(); i++) {
				char ch = x.toLowerCase().charAt(i);
				int value = ch;
				count[value]++;
			}
		}
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " : " + count[c]);
		}
	}
}