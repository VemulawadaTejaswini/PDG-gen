import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] x = new int[n*d];
		int distanceBase = 0;
		double distance = 0;
		int ans = 0;
		
		for(int i=0;i<n*d;i++){
			x[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=0;k<d;k++){
					distanceBase += (x[i*d+k]-x[j*d+k])*(x[i*d+k]-x[j*d+k]);
				}
				
				distance = Math.sqrt(distanceBase);
				if(distance - (int) distance == 0.0){
					ans ++;
				}
				distanceBase = 0;
			}
		}
		System.out.println(ans);
	}
}