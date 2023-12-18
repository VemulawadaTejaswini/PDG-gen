import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int x;
		int[][] sig  = {
				{0, 1, 1, 1, 1, 1, 1},
				{0, 0, 0, 0, 1, 1, 0},
				{1, 0, 1, 1, 0, 1, 1},
				{1, 0, 0, 1, 1, 1, 1},
				{1, 1, 0, 0, 1, 1, 0},
				{1, 1, 0, 1, 1, 0, 1},
				{1, 1, 1, 1, 1, 0, 1},
				{0, 1, 0, 0, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 0, 1, 1, 1, 1}
		};
		
		int[] ans;
		
		while(true){
			n = scan.nextInt();
			
			if(n == -1)break;
			
			ans = new int[7];
			
			for(int i = 0; i < n; i++){
				x = scan.nextInt();
				for(int j = 0; j < 7; j++){
					if(ans[j] != sig[x][j])ans[j] = 1;
					else ans[j] = 0;
					System.out.print(ans[j]);
					ans[j] = sig[x][j];
				}
				System.out.println();
			}
		}
	}
}