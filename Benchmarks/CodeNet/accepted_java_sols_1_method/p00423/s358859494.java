import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		while((n = scan.nextInt()) > 0){
			int[][] c = new int[n][2];
			int sumA = 0;
			int sumB = 0;
			
			for(int i = 0; i < n; i ++){
				int a = c[i][0] = scan.nextInt();
				int b = c[i][1]	= scan.nextInt();
				
				if(a > b)
					sumA += a + b;
				else if(a == b){
					sumA += a;
					sumB += b;
				}else if(a < b)
					sumB += a + b;
			}
			System.out.println(sumA + " " + sumB);
		}
	}
}