import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		System.out.println(a < b && b < c ? "Yes" : "No");
	}
}