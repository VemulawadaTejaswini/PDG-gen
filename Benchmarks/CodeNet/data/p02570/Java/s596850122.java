import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long D = scan.nextLong();
		long T = scan.nextLong();
		long S = scan.nextLong();
		String ans = (D>T*S)?"No":"Yes";
		System.out.println(ans);
	}
}