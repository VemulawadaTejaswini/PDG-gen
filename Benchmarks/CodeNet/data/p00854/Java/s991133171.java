import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && k==0 && m==0) break;
			
			boolean[] f = new boolean[n];
			m--;
			for(int i=0;i<n-1;i++){
				f[m] = true;
				for(int j=0;j<k;j++){
					m++;
					if(m==n) m=0;
					while(f[m]==true){	
						m++;
						if(m==n) m=0;
					}
				}
			}
			
			for(int i=0;i<n;i++){
				if(f[i]==false){
					System.out.println(i+1);
					break;
				}
			}
		}	
	}	
}