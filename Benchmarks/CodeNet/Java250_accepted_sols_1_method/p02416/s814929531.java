import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			String s = sc.next();
			if (s.equals("0")) {break;}
			else {
				int sum = 0;
				for (int i=0; i<s.length(); i++) {
					int n = Integer.parseInt(String.valueOf(s.charAt(i)));
					sum += n;
				}
				System.out.println(sum);
			}
		}
	}
}
