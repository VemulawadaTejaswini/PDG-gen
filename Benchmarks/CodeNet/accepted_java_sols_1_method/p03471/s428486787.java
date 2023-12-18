import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = sc.nextInt() / 1000;
		
		boolean flag = true;
		loop : for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n - i; j++) {
				int k = n - i - j;
				if(i * 10 + j * 5 + k == y) {
					System.out.printf("%d %d %d\n", i, j, k);
					flag = false;
					break loop;
				}
			}
		}
		
		if(flag) {
			System.out.println("-1 -1 -1");
		}
	}
}