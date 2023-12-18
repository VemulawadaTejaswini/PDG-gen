import java.util.*;

public class Main {

	public static void main(String[] args) {
		int sum;
		String s;
		Scanner sc = new Scanner(System.in);
		while (true) {
			s = sc.next();
			sum = 0;
			if (s.equals("0"))
				break;
			for (int i = 0; i < s.length(); i++) {
				sum += Integer.parseInt(""+ s.charAt(i));
			}
			if (!s.equals("0"))
				System.out.println(sum);
		}
	}

}