import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		
		int costLeft = 0;
		int costRight = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			if (a < x) costLeft++;
			if (x < a) costRight++;
		}
		
		System.out.println(Math.min(costLeft, costRight));
		
		sc.close();
	}
}


