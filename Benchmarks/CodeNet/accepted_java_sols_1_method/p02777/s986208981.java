import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String u = sc.next();
		sc.close();

		if(u.equals(s)) {
			a--;
		}else if(u.equals(t)) {
			b--;
		}

		System.out.println(String.format("%d %d", a, b));
	}
}
