import java.util.ArrayList;
import java.util.Scanner;
	public class Main {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[]=new int[M];
		int B[]=new int[M];
		int ans[]=new int[N];
		int ans2[]=new int[N];
		for(int i=0;i<N;i++) {
			ans[i]=0;
			ans2[i]=0;
		}
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(1);
		for(int i=0;i<M;i++) {
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
		}
		for(int i=0;i<=2*10*10*10*10*10;i++) {
			ArrayList<Integer> y=new ArrayList<Integer>();
			for(int k=0;k<x.size();k++) {
			for(int j=0;j<M;j++) {
				if(A[j]==x.get(k)&&ans2[B[j]-1]==0) {
					y.add(B[j]);
					ans[B[j]-1]=x.get(k);
					ans2[B[j]-1]=1;
				}
				else if(B[j]==x.get(k)&&ans2[A[j]-1]==0) {
					y.add(A[j]);
					ans[A[j]-1]=x.get(k);
					ans2[A[j]-1]=1;
				}
				else {}
			}
		}
			if(y.size()==0) {
				break;
			}
			int m=x.size();
		for(int k=0;k<m;k++) {
			x.remove(0);
		}
		int n=y.size();
		for(int k=0;k<n;k++) {
			x.add(y.get(k));
		}
		for(int k=0;k<n;k++) {
			y.remove(0);
		}
	}
		int z=0;
		for(int i=1;i<N;i++) {
			if(ans[i]==0) {
				System.out.println("No");
				z=1;
				break;
			}
		}
		if(z==0) {
			System.out.println("Yes");
			for(int i=1;i<N;i++) {
				System.out.println(ans[i]);
			}
		}
}
}
