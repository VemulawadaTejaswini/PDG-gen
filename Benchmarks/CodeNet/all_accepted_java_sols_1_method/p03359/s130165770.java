import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int takahashi = a <= b? a:a-1;
		System.out.println(takahashi);
	}
}