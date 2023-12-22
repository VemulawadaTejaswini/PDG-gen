import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = Integer.valueOf(a + b);
		boolean ok = false;
		for(int i = 1 ; i <= 1010 ; i++) {
			if(c == i * i) ok = true;
		}
		if(ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
