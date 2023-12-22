import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			q[i] = i + 1;
		}
		for(int i = 0; i < n; i++) {
			if (p[i] != q[i])
				cnt++;
		}
		if (cnt == 0 || cnt == 2)
			out.println("YES");
		else
			out.println("NO");
	}
}