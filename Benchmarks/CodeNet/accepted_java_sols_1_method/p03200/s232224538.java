import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		long res = 0;
		long numB = 0;
		for (String element : input) {
			if (element.equals("W")) {
				res += numB;
			} else {
				numB++;
			}
		}
		System.out.println(res);

	}
}
