import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			if(n==0 && w==0) break;
			
			int[] a = new int[1000];
			int maxw = 0;
			for(int i=0;i<n;i++){
				int v = sc.nextInt();
				maxw = Math.max(maxw, v);
				a[v/w]++;
			}
			maxw/=w;
			
			int maxv = 0;
			for(int i=0;i<n;i++) maxv = Math.max(maxv, a[i]);
			
			double sum = 0;
			for(int i=0;i<=maxw;i++){
				sum += ((double)(maxw-i)/maxw)*(double)a[i]/maxv;
			}
			System.out.println(sum+0.01);
		}	
	}	
}