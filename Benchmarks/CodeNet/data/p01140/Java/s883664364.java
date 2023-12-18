import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for(int i=1;i<=n;i++) h[i] = h[i-1] + sc.nextInt();
			for(int i=1;i<=m;i++) w[i] = w[i-1] + sc.nextInt();
			
			int[] x = new int[(n+1)*(m+1)];
			int[] y = new int[(n+1)*(m+1)];
			for(int i=0;i<=n;i++){
				for(int j=0;j<=m;j++){
					y[i*(m+1)+j] = h[i];
					x[i*(m+1)+j] = w[j];
				}
			}
			
			int count = 0;
			for(int i=0;i<(n+1)*(m+1);i++){
				for(int j=i+1;j<(n+1)*(m+1);j++){
					if(x[j]-x[i]==y[j]-y[i]) count++;
				}
			}
			System.out.println(count);
		}	
	}	
}