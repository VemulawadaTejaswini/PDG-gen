import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		char[] x;

		Scanner stdIn = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			int sum = 0;
			x = stdIn.nextLine().toCharArray();
			if(x[0] == '0') {
				break;
			}

			for (int j = 0; j < x.length; j++) {
				sum += Character.getNumericValue(x[j]);
			}
			System.out.println(sum);
		}
		stdIn.close();
	}
}