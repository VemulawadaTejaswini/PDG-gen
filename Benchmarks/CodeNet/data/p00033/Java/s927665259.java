import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int L = 0;
			int R = 0;
			boolean F = true;
			for (int j=0; j<10; j++) {
				int ball = sc.nextInt();
				if (ball > L) {L = ball;}
				else if (ball > R) {R = ball;}
				else {F = false;}
			}
			out.println(F?"YES":"NO");
		}
	}
}
