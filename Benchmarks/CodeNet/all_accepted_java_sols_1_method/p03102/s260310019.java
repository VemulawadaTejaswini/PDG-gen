
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		//int[][] a = new int[n][m];
		int[] b = new int[m];
		int count = 0;
		
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			int result = 0;
			for(int j = 0; j < m; j++) {
				int a = sc.nextInt();
				result += b[j]*a;
			}
			result += c;
			
			if(result > 0) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
