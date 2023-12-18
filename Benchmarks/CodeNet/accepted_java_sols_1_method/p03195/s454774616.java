import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() % 2 == 1) {
				System.out.println("first");
				return;
			}
			
		}
		System.out.println("second");
	}
}