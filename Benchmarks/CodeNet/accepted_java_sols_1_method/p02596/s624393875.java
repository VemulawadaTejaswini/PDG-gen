import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		scanner.close();
		long svn = 7;
		boolean flag = false;

		int i = 0;
		while (i < K) {
			i++;
			if (svn % K == 0) { flag = true; break; }
			svn = (svn * 10 + 7) % K;
		}

		if (flag) System.out.println(i);
		else System.out.println(-1);
	}
}