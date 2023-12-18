import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i=1;i<n;i++) a[(i*i)%n]++;
			
			int count = 0;
			for(int i=1;i<n;i++){
				if(a[i]>0){
					b[count] = i;
					count++;
				}
			}
			
			int[] ans = new int[(n-1)/2];
			int p;
			for(int i=0;i<count;i++){
				for(int j=0;j<count;j++){
					if(i!=j){
						p = b[i]-b[j];
						if(p<0) p = p+n;
						if(p>(n-1)/2) p = n-p;
						ans[p-1]++;
					}
				}
			}

			for(int i=0;i<(n-1)/2;i++) System.out.println(ans[i]);
		}	
	}	
}