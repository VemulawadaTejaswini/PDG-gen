import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int ans = (x == 1 ? 0 : 1);
		System.out.println(ans);
	}
}
