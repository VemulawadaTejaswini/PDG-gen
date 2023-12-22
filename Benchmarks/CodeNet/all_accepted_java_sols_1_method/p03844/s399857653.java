import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String plusminus = sc.next();
		int m = Integer.parseInt(sc.next());
		
		if (plusminus.equals("+")) {
			System.out.println(n + m);
		}else if (plusminus.equals("-")) {
			System.out.println(n - m);
		}
	}
}
