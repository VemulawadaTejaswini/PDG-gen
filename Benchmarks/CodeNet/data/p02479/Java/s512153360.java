import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(2 * Math.PI * r + " " + Math.PI * r * r);
	}
}