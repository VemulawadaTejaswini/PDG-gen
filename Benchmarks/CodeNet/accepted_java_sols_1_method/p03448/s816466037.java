import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int cnt = 0;
		
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {
					int x = (a * 500) + (b * 100) + (c * 50);
					if(X == x) cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		sc.close();

	}

}