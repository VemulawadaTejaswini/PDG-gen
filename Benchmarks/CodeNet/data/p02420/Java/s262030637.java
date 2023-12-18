import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line2 = sc.next();
		while (true) {
			String line1 = sc.next();

			if(line1.equals("-")) {
				break;
			} else {

				try {
					int num = Integer.parseInt(line1);
					StringBuilder sb = new StringBuilder(line2);
					String cutLine = sb.substring(num, line2.length() - 1);

					line2 = sb.delete(num, line2.length() - 1).toString() + cutLine;

				}catch (NumberFormatException e) {
					System.out.println(line2);
					line2 = line1;
				}

			}
		}
		System.out.println(line2);
	}


}