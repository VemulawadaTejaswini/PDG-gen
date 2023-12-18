import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// INPUT
		int n = sc.nextInt();
		if(2>n && n<200) System.exit(-1);
		int[][] arr = new int[n][3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// PROCESSING
		int[][] work = new int[n][3];
		
		int[] sum = new int[n];
		for(int i=0; i<n; i++) {
			sum[i] = 0;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<n; j++) {
				work[j][i] = arr[j][i];
				for(int k=0; k<n; k++) {
					if(j != k && arr[j][i] == arr[k][i]) {
						work[k][i] = 0;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				sum[i] += work[i][j];
			}
		}
		
		//OUTPUT
		for(int i=0; i<n; i++) System.out.println(sum[i]);
	}
}