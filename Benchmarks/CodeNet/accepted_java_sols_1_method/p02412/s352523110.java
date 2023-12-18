import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int co = 0;

			if(n == 0 && x == 0) break;

			for(int i=1; i<=n-2; i++) {
				for(int j=i+1; j<=n-1; j++) {
					for(int k=j+1; k<=n; k++) {
						if(i + j + k == x) co++;
						
						if(i == n-2 && j == n-1 && k == n) {
							System.out.println(String.format("%d",co));
						}
					}
				}
			}
		}
	}
}

