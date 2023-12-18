import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			int h1 = sc.nextInt();
			int h2 = sc.nextInt();
			int h_now = h1+h2;
			int e1 = sc.nextInt();
			
			int num = 0;
			for (int i=1; i<=10; i++) {
				if (i==h1 || i==h2 || i==e1) {
					continue;
				}
				if (i+h_now <= 20) {
					num++;
				}
			}
			
			out.println(num>3?"YES":"NO");
		}
	}
}
