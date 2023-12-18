import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int ans=0;
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				ans+=(A[i]*A[j])%1000000007;
				System.out.println(ans);
				ans%=1000000007;
			}
		}
		System.out.println(ans);
		
		
	}
}
