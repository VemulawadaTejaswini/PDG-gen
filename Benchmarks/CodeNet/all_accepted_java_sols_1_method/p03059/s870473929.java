import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int c = t / a;
		System.out.println(b * c);
	}
}