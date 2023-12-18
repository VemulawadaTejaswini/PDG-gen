import java.util.Scanner;

public class Main {
	public static final int MAX = 60000;
	public static boolean[] isPrime = new boolean[MAX + 1];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		eratos();
		
		int n;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			
			for (int i = n - 1; i > 0; i--) {
				if (isPrime[i] == true) {
					System.out.print(i + " ");
					break;
				}
			}
			
			for (int i = n + 1; i < MAX; i++) {
				if (isPrime[i] == true) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	public static void eratos() {
		for (int i = 0; i < MAX + 1; i++) {
			isPrime[i] = true;
		}
		
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= Math.sqrt(MAX); i++) {
			if (isPrime[i] == true) {
				for (int j = i + i; j <= MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
}