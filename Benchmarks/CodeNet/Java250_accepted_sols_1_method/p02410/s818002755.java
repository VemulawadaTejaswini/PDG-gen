import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int vecnm[][] = new int[n][m];
		int i,j;
		int vec[] = new int[m];
		int veca[] = new int[n];
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				vecnm[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<m;i++){
			vec[i] = sc.nextInt();
		}
		sc.close();
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				veca[i] += (vecnm[i][j]*vec[j]);
			}
		}
		for(i=0;i<n;i++){
			System.out.println(veca[i]);
		}
	}

}

