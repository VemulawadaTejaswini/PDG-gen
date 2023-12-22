import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int M=sc.nextInt();
		int a[]=new int[A];
		int b[]=new int[B];
		int minA=100000;
		int minB=100000;
		for(int i=0;i<A;i++) {
			a[i]=sc.nextInt();
			if(a[i]<minA){
				minA=a[i];
			}
		}
		for(int i=0;i<B;i++) {
			b[i]=sc.nextInt();
			if(b[i]<minB){
				minB=b[i];
			}
		}
		int ans=minA+minB;
		int x[]=new int[M];
		int y[]=new int[M];
		int c[]=new int[M];
		for(int i=0;i<M;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			c[i]=sc.nextInt();
			if(ans>a[x[i]-1]+b[y[i]-1]-c[i]) {
				ans=a[x[i]-1]+b[y[i]-1]-c[i];
			}
		}
		System.out.println(ans);


	}
}
