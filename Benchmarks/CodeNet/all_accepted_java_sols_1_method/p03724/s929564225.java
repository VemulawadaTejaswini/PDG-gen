
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int cost[] = new int[n + 1];

		for(int i = 0; i < m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a == 1){
				cost[b]++;
			}
			else if(b == 1){
				cost[a]++;
			}
			else {
				cost[a]++;
				cost[b]++;
			}
		}

		for(int i = 0; i <= n; i++){
			if(cost[i] % 2 == 1){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
