import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int hako[]=new int [n];
		int list[]=new int [m];
		int a=0;
		int b=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++) {
			list[j]=sc.nextInt();
		}
		
		while(hako[a]<k || list[b]<k) {
			//両方未完結
			if(a<n && b<m) {
				if(hako[a]<=list[b] && hako[a]<=k){
					k-=hako[a];
					ans++;
					a++;
				}
				else if(hako[a]>list[b] && list[b]<=k){
					k-=list[b];
					ans++;
					b++;
				}
			}
			//Aが完結
			else if(a==n-1) {
				if(hako[a]>list[b] && list[b]<=k){
					k-=list[b];
					ans++;
					b++;
				}
			}
			//Bが完結
			else if(b==m-1) {
				if(hako[a]<=list[b] && hako[a]<=k) {
					k-=hako[a];
					ans++;
					a++;
				}
			}
			
			
		}
		
		System.out.println(ans);
	}

}
