import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.ceil(sc.nextLong() / 2.0) >= sc.nextLong() ? "YES" : "NO");
	}
}