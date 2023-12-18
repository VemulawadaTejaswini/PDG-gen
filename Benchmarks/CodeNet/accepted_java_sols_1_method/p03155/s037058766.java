import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		System.out.println((n + 1 - h) * (n + 1 - w));
	}
}