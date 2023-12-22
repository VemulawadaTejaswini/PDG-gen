import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] x =new int[n+1][d+1];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
	int sum = 0;	
	int count = 0;
	for (int i = 1; i <= n-1; i++) {
		for (int j = i+1; j <= n; j++) {
			for(int k = 1; k <= d; k++) {
				//System.out.println(i+" "+j+" "+k);
				sum += Math.pow((x[i][k]-x[j][k]),2);
			}
			double dist= Math.sqrt(sum);
			//System.out.println(dist+" "+(int)dist);
			if(dist-(int)dist == 0) count++;
			sum = 0;
	}
	}	
		System.out.println(count);
	}
}
