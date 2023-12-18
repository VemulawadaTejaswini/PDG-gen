import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans, syu;
		ans = x * y;
		syu = 2*(x + y);
		System.out.print(ans + " " +syu);
	}

}