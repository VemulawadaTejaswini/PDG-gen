import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();

		String input = Integer.toString(a1) + Integer.toString(a2);
		int iValue = Integer.parseInt(input);
		double sqrt = Math.floor(Math.sqrt(iValue));

		String ret;
		if (iValue == Math.pow(sqrt, 2)) {
			ret = "Yes";
		} else {
			ret = "No";
		}

		System.out.println(ret);
	}

}