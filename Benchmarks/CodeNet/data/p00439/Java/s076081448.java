import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0 && k==0)break;
			int[] a = new int[n];
			int[] b = new int[n-k+1];
			
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<n-k+1;i++){
				for(int j=0;j<k;j++){
					b[i] += a[i+j];
				}
			}
			
			Arrays.sort(b);
			
			System.out.println(b[n-k]);
		}
	
	}	
}