import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		for (int i = Math.max(x - k + 1, -1000000); i <= Math.min(x + k - 1, 1000000); i++) {
			if (flag) {
				sb.append(" ");
			}
			flag = true;
			sb.append(i);
		}
		System.out.println(sb);
	}
}
