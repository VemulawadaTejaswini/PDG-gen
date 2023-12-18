import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean ans = false;
		if ((a * b) % 2 != 0) {
			ans = true;
		}
		System.out.println(ans ? "Yes" : "No");
	}

}
