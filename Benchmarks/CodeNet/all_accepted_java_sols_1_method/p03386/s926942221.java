import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		for (int i=A; i<=B; i++) {
			if (i<A+K || i>B-K) System.out.println(i);
		}

	}
}
