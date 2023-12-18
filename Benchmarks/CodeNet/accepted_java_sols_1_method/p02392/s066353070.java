import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		String result = "No";
		
		if ((a < b) && (b < c)) {
			result = "Yes";
		}
		
		System.out.println(result);
	}
}