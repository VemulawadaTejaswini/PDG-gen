import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0) break;
			int ways = 0;
			for (int i = 1; i <= n; i++){
				for (int j = i + 1; j <= n; j++){
					for (int k = j + 1; k <= n; k++){
						//System.out.printf("%d+%d+%d=%d\n", i, j, k, (i+j)+k);
						if ((i + j) + k == x) ways++;
					}
				}
			}
			System.out.println(ways);
		}
	}
}