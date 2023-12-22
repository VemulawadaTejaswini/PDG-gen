import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int min = (int) 1e9;
		
		for (int i = 0; i < n; i++) {
			
			int a = sc.nextInt();
			
			int cnt = 0;
			
			while (a % 2 == 0) {
				
				a /= 2;
				cnt++;
				
			}
			
			min = Math.min(min, cnt);
			
		}
		
		System.out.println(min);
		
	}

}
