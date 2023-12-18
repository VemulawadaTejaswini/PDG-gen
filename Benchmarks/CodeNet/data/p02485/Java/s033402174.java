import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if (str.equals(0)) break;
			int sum = 0;
			for (int i=0; i<str.length(); i++) {
				sum += Integer.parseInt(str.substring(i, i+1));
			}
			System.out.println(sum);
		}
		sc.close();
	}
}