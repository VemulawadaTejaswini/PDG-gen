import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int max = 1 - (int) Math.pow(10, 9);
		int ri = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			int rj = scanner.nextInt();
			max = Math.max(max, rj - ri);
			ri = Math.min(ri, rj); 
		}
		
		scanner.close();
		
		System.out.println(max);
	}
} 

