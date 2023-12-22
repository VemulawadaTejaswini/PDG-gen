import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int vecnm[][] = new int[n][m];
		int vecml[][] = new int[m][l];
		int i,j,k;
		long veca[][] = new long[n][l];
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				vecnm[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<l;j++){
				vecml[i][j] = sc.nextInt();
			}
			
		}
		sc.close();
		
		for(i=0;i<n;i++){
			for(j=0;j<l;j++){
				for(k=0;k<m;k++){
					veca[i][j]+=vecnm[i][k]*vecml[k][j];
				}
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<l;j++){
				System.out.print(veca[i][j]);
				if(j!=(l-1)){
					System.out.print(" ");
				}
			}
			//if(i!=(n-1)){
				System.out.println();
			//}
		}
	}

}
