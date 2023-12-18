import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int p;
		long sum = 1;
		for(int i=0;i<n;i++){
			p = sc.nextInt();
			for(int j=1;j<=p;j++){
				a[j]++;
				if(j==n){
					sum += p-n;
					break;
				}
			}
		}
		for(int i=1;i<=n;i++) sum += Math.min(i*4, a[i]);
		System.out.println(sum);
	}	
}