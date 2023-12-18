import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int v[] = new int [N+1];
		int w[] = new int [N+1];
		for (int i=0; i<N; i++){
			v[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		int price[][] = new int [N+1][W+1];	
		for (int i=N-1; i>=0; i--){
			for (int j=1; j<=W; j++){
				if (j-w[i]<0) price[i][j]=price[i+1][j];
				else price[i][j]=Math.max(price[i+1][j], (price[i][j-w[i]]+v[i]));
			
			}
		}
		System.out.println(price[0][W]);
	}
}