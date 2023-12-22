import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		char S[] = x.toCharArray();
		String y = sc.next();
		char T[] = y.toCharArray();
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if(S[i] == T[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
