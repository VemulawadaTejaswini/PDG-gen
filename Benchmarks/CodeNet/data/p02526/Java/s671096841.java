import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean[] u = new boolean[10000001];
		for (int i = 0; i < n; i++) {
			u[sc.nextInt()] = true;
		}
		
		int count = 0;
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) {
			if (u[sc.nextInt()]) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}