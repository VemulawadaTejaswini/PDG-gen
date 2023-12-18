import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		while (sc.hasNext()) {
			if (str.equals("-")) break;
			String nextStr = sc.nextLine();
			if (Character.isDigit(nextStr.charAt(0))) {
				str = new StringBuilder()
						.append(str.substring(Integer.parseInt(nextStr)))
						.append(str.substring(0, Integer.parseInt(nextStr)))
						.toString();
			} else {
				System.out.println(str);
				str = nextStr;
			}
		}
		sc.close();
	}
}