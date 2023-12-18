import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n; n = in.nextInt();
		int a = (n + 999) / 1000;
		n = 1000 * a - n;
		System.out.println(n);
	}
}
