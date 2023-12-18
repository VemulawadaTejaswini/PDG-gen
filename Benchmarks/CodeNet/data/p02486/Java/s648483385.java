import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
		
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0)if(x == 0)break;
			int result = 0;
			
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x) {
							result++;
						}
					}
				}
			}
			
			System.out.println(result);
		}
	}
}