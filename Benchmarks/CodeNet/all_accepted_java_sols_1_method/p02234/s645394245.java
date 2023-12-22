import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] lst= new int[n+1];
		for(int i=0;i<n;i++){
		    lst[i]=sc.nextInt();lst[i+1]=sc.nextInt();
		}
		sc.close();
		
		int[][] table = new int[n+1][n+1];
		for(int i=1;i<=n;i++)table[i][i]=0;
		
		for(int l=2;l<=n;l++) {
			for(int i=1;i<=n-l+1;i++) { //gain table[j][i+j]
				int min = Integer.MAX_VALUE;
				int j=i+l-1;
				for(int k=i;k<=j-1;k++){
				    int x = table[i][k] + table[k+1][j] + lst[i-1]*lst[k]*lst[j];
				    min = Math.min(min,x);
				}
				table[i][j]=min;
			}
			
		}
		System.out.println(table[1][n]);
	}
}
