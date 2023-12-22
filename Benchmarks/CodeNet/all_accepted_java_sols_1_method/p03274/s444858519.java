import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int A[]=new int [N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		int d;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<=N-K;i++) {
			int b=Math.abs(A[i])+Math.abs(A[i+K-1]-A[i]);
			int c=Math.abs(A[i+K-1])+Math.abs(A[i+K-1]-A[i]);
			d=Math.min(b,c);
			if(ans>d) {
				ans=d;
			}
		}
		System.out.println(ans);
	}
}