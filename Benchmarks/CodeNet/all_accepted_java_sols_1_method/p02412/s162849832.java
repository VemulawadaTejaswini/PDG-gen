import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();	// 3 ≤ n ≤ 100
			int x = scanner.nextInt();	// 0 ≤ x ≤ 300
			if(n==0&&x==0) {
				break;
			}
			int num = 0;
			for(int i=1;i<=n-2;i++) {
				for(int j=i+1;j<=n-1;j++) {
					for(int k=j+1;k<=n;k++) {
						if (i+j+k==x) {
							num++;
						}
					}
				}
			}
			System.out.println(num);
			
		}
		scanner.close();
	}
}
