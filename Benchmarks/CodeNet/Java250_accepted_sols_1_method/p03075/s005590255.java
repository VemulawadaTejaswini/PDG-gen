import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int e = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		int f = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		System.out.println(f-a>k ? ":(" : "Yay!");
	}
}