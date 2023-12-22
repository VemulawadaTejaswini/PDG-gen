import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		
		int a = (h2 * 60 + m2) - (h1 * 60 + m1) - k;
		
		if (a < 0) a = 0;
		System.out.println(a);
	}
}