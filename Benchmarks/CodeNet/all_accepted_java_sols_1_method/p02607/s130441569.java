import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			if (i % 2 == 1 && a % 2 == 1) cnt++;
		}
		
		System.out.println(cnt);
				
		sc.close();
	}
	
}

