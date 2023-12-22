
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t[][] = new int[N][2];		
		for(int i=0;i<N;i++) {
			t[i][0]=sc.nextInt();//x
			t[i][1]=sc.nextInt();//y
		}
		sc.close();
		
		
		double d[][] = new double[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				//iからjへの距離
				int tix = t[i][0];
				int tiy = t[i][1];
				
				int tjx = t[j][0];
				int tjy = t[j][1];
				
				double dist = Math.sqrt(Math.pow(tix-tjx,2)+Math.pow(tiy-tjy,2));
				
				d[i][j]=dist;
				d[j][i]=dist;
			}
		}
		
		double sum = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sum += d[i][j];
			}
		}
		double ans = sum/N;
		
		System.out.println(ans);
		
	}
}
