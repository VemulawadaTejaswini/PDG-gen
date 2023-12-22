import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		char[] c = s.toCharArray();
		for(int i = 0 ; i < s.length() ; i++) {
			for(int j = 0 ; j< c.length ; j++) {
				c[j] = s.charAt((j + i) % c.length);
			}
			if(String.valueOf(c).equals(t)) {
				System.out.println("Yes");
				sc.close();
				return;
			}
		}
		System.out.println("No");

		sc.close();

	}

}
