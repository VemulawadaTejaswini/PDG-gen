import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		if(Y % 2 != 0) {
			prtln("No");
			return;
		}
		if(X * 4 == Y) {
			prtln("Yes");
			return;
		}
		if(X * 2 == Y) {
			prtln("Yes");
			return;
		}
		boolean ok = false;
		for(int i = 1; i <= X; i++) {
			// System.out.println((Y - (i * 4)) / 2 +" == "+ (X - i));
			if((Y - (i * 4)) / 2 == (X - i)) {
				ok = true;
				break;
			}
		}
		prtln(ok ? "Yes" : "No");
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
