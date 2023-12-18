import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String expected = "CODEFESTIVAL2016";
		final String[] expArr = expected.split("");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sArr = s.split("");
		int count = 0;
		for (int i = 0; i < expArr.length; i++) {
			if (!sArr[i].equals(expArr[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
