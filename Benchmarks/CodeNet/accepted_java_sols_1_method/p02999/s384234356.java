import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		sc.close();
		int ans = x<a?0:10;
		System.out.println(ans);
	}
}
