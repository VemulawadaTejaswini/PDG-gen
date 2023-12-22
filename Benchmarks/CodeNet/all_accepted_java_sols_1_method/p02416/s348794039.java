import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			String s = sc.next();
			if (s.equals("0")) return;
			int sum = 0;
			for (int i=0; i<s.length(); i++) {
				sum += s.charAt(i) - '0';
			}
			System.out.println(sum);
		}
		
		
	}
}
