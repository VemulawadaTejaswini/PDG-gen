import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int AB = A * B;
		
		for (int i=1; i<=3; i++) {
			int mul = AB * i;
			if (mul % 2 != 0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}