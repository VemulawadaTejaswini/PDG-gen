import java.util.Scanner;

public class Main {
	static int map[][];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k,sum;
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			map=new int[n+1][n+1];
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					map[i][j]=sc.nextInt();
			//
			k=0;
			for(i=0;i<n;i++){
				sum=0;
				for(j=0;j<n;j++){
					sum+=map[i][j];
				}
				map[i][n]=sum;
				k+=sum;
			}
			
			for(j=0;j<n;j++){
				sum=0;
				for(i=0;i<n;i++){
					sum+=map[i][j];
				}
				map[n][j]=sum;
				//k+=sum;
			}
			
			map[n][n]=k;
			
			for(i=0;i<=n;i++){
				for(j=0;j<=n;j++){
					System.out.printf("%5d",map[i][j]);
				}
				System.out.println();
			}
		}//while
	}
}