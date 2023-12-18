import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int s = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		System.out.println(s / 60);
		System.out.println(s % 60);
	}
}