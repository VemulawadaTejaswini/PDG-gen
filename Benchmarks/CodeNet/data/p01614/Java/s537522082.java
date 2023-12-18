import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			sum += b[i];
		}
		
		int[] ans = new int[sum+1];
		Arrays.fill(ans, -1);
		ans[0] = 0;
		
		for(int i=0;i<=sum;i++){
			for(int j=0;j<n;j++){
				if(ans[i]>=0){
					for(int k=a[j];k<=b[j];k++){
						if(i+k<=sum) ans[i+k] = Math.max(ans[i+k], ans[i]+c[j]);
					}
				}
			}
		}
		
		int m = sc.nextInt();
		int[] d = new int[m];
		boolean flag = false;
		for(int i=0;i<m;i++){
			d[i] = sc.nextInt();
			if(d[i]>sum || ans[d[i]]<=0) flag = true;
		}
		
		if(flag==true){
			System.out.println("-1");
		}else{
			for(int i=0;i<m;i++) System.out.println(ans[d[i]]);
		}
	}	
}