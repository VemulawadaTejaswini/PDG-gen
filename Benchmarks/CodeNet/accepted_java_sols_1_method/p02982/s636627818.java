import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x[][] = new int[n][d];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < d; j++){
				x[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				double a = 0;
				for(int k = 0; k < d; k++){
					a += Math.pow((double)(x[i][k] - x[j][k]),2);
				}
				for(int k = 0; k <= (int)a; k++){
					if(Math.pow((double)k,2.0) == a){
						count += 1;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}