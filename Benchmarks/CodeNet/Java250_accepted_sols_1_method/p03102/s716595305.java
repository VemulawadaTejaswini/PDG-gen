import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c = sc.nextInt();
			int[] b = new int[m];
			int[][] a = new int[n][m];
			for(int i = 0; i < m; i++){
				b[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			int sum = 0;
			int flag = 0;
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j < a[i].length; j++){
					sum = sum + (a[i][j] * b[j]);
					if( j == a[i].length-1){
						if( sum + c > 0 ){
							flag++;
						}
						sum = 0;
					}
				}
				
			}
			System.out.println(flag);
	}
}