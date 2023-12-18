
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				if(n+m==0) break;
				
				int[] p=new int[n+2];
				for(int i=0; i<n; i++) {
					p[i]=sc.nextInt();
				}
				p[n]=0;
				
				int[] sum=new int[(n+1)*(n+1)+2];
				int size=0;
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						sum[size]=p[i]+p[j];
						size++;
					}
				}//2本分で取れる得点
				Arrays.sort(sum);
				int ans=0;
				
				for(int i=0; i<size; i++) {
					int rem=m-sum[i];//残り2本の得点maxを探す
					if(rem<0) continue;
					int left=0, right=size;
					
					while(left<right) {//binary search
						int mid=(left+right)/2;
						if(rem>sum[mid]) {
							left=mid+1;
						}
						else if(rem<sum[mid]) {
							right=mid;
						}
						else {
							break;
						}
					}
					ans=Math.max(ans, sum[i]+sum[right-1]);
				}
				System.out.println(ans);

			}
		}
	}
}


