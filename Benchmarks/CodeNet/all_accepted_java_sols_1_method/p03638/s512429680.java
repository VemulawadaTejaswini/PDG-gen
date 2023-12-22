import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int k = sc.nextInt();
		int[] x=new int[n*m];
		int l = 0;
		for(int t=1;t<=k;t++){
			int u=sc.nextInt();
			for(int i=0;i<u;i++){
				x[l] = t;
				l++;
			}
		}
		l = 0;
		int[][] y=new int[n][m];
		for(int i=0;i<n;i++){
			if(i%2==0){
				for(int j=0;j<m;j++){
					y[i][j] = x[l];
					l++;
				}
			}
			else{
				for(int j=m-1;j>=0;j--){
					y[i][j] = x[l];
					l++;
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
	}
}