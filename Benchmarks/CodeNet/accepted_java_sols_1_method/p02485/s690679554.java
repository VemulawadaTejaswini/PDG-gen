
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String m;
		int num = 0;
		while (true) {
			m = scanner.next();
			num = 0;
			if (m.length() == 0||Character.getNumericValue(m.charAt(0))==0) {
				break;
			}

			for(int i=0;i<m.length();i++) {
				num+=Character.getNumericValue(m.charAt(i));
			}
			System.out.println(num);
		}
		scanner.close();
	}
}