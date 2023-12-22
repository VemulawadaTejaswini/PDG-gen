import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt() + sc.nextInt() + sc.nextInt();
		System.out.println((x > 21)?"bust":"win");
	}
}