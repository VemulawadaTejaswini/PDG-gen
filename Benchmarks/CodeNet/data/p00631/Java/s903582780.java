import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			int sum = 0;
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				sum += a[i];
			}
			
			Arrays.sort(a);
			boolean[] f = new boolean[sum+1]; 
			f[0] = true;
			int max = 0;
			for(int i=0;i<n;i++){
				for(int j=max;j>=0;j--){
					if(f[j]) f[j+a[i]] = true;
				}
				max += a[i];
			}
			
			for(int i=0;;i++){
				if(f[sum/2+i] || f[sum/2-i]){
					System.out.println(i*2+sum%2);
					break;
				}
			}
		}
	}

}