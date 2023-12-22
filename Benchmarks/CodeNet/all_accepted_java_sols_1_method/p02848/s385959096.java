import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int al = 26;
		int a = 'A';
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String line = sc.nextLine();
		for (char c : line.toCharArray()) {
			System.out.print((char) (((c-a + n) % al) + a));
		}
		System.out.println();
	}
}
