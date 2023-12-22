import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s,t;
		s = sc.next();
		t = sc.next();
		int a,b;
		String u;
		a = sc.nextInt();
		b = sc.nextInt();
		u = sc.next();

		if(u.equals(s)) {
			a--;
		}else if(u.equals(t)) {
			b--;
		}
		System.out.println(a + " " + b);

		sc.close();

	}

}