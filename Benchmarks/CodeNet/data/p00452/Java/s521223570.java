import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N,M;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		int[]a = new int[N+1];
		for(int i=1;i<=N;i++){
			a[i]=sc.nextInt();
		}
		int[] b = new int[(N+1)*(N+1)];
		int cnt=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				b[cnt]=a[i]+a[j];
				cnt++;
			}
		}
		Arrays.sort(b);
		int ans=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]+a[j]>M)continue;
				int left=0,right=b.length-1,mid=-1;;
				int sum = a[i]+a[j];
				while(left<right-1){
					mid=(left+right)/2;
					if(b[mid]+sum == M){
						System.out.println(M);
						return; 
					}
					else if(b[mid]+sum < M){
						left=mid;
					}
					else{
						right=mid;
					}
				}
				ans=Math.max(ans, b[left]+sum);	
						
			}
		}
		System.out.println(ans);
	}

}