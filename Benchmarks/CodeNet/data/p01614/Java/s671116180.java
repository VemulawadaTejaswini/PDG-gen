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
		int[] temp = new int[sum+1];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=sum;j++){
				if(ans[j]>0){
					for(int k=a[i];k<=b[i];k++){
						if(j+k<=sum) temp[j+k] = Math.max(temp[j+k], ans[j]+c[i]);
					}
				}
			}
			for(int j=a[i];j<=b[i];j++) temp[j] = Math.max(temp[j], c[i]);
			for(int j=0;j<=sum;j++){
				ans[j] = Math.max(ans[j], temp[j]);
				temp[j] = 0;
			}
		}
		
		int m = sc.nextInt();
		int[] d = new int[m];
		boolean flag = false;
		for(int i=0;i<m;i++){
			d[i] = sc.nextInt();
			if(ans[d[i]]==0) flag = true;
		}
		
		if(flag==true){
			System.out.println(-1);
		}else{
			for(int i=0;i<m;i++) System.out.println(ans[d[i]]);
		}
	}	
}