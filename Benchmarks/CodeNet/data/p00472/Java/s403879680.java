import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),m=in.nextInt(),D[]=new int[n+1],dp[]=new int[m+1],L=0;
		dp[0]=1;
		
		for(int i=1;i<n;i++){
			D[i]=in.nextInt();
		}
		
		for(int i=1;i<n;i++){
			System.out.print(D[i]+" ");
		}
		System.out.println();
		
		for(int i=1;i<=m;i++){
			int a=in.nextInt();
			int d=0;
			if(a<0)d=-1;
			for(int j=0;j<Math.abs(a);j++){
				L+=D[dp[i-1]+d+(j*d)];
			}
			
			dp[i]=dp[i-1]+a;
		}
		
		System.out.println(L);
	}

}

