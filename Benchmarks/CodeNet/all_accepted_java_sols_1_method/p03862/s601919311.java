import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		long ans=0;
		if(a[0]>x){
			ans+=a[0]-x;
			a[0]-=ans;
		}
		for (int i = 0; i < n-1; i++) {
			if(a[i]+a[i+1]>x){
				ans+=Math.min(a[i]+a[i+1]-x,a[i+1]);
				a[i+1]-=Math.min(a[i]+a[i+1]-x,a[i+1]);;
			}
		}
		System.out.println(ans);
		
	
	}
	
}