import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < num; i++){
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			int m = str1.length();
			int n = str2.length();
			int[][] c = new int[m+1][n+1]; 
			
			for(int j = 0; j <= m; j++){
				c[j][0] = 0;
			}

			for(int j = 0; j <= n; j++){
				c[0][n] = 0;
			}

			for(int j = 1; j <= m; j++){
				for(int k = 1; k <= n; k++){
					if(str1.charAt(j-1) == str2.charAt(k-1)){
						c[j][k] = c[j-1][k-1] + 1;
					}else if(c[j-1][k] > c[j][k-1]){
						c[j][k] = c[j-1][k];
					}else{
						c[j][k] = c[j][k-1];
					}
				}
			}

			System.out.println(c[m][n]);
		}
	}
}