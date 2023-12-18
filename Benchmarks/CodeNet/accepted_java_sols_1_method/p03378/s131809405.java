import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();
		int b=0;
		int c=0;
		int a[]=new int [N+1];
		for(int i=0;i<M;i++) {
			b=sc.nextInt();
			a[b]=1;
		}
		for(int i=X;i>0;i--) {
			c=c+a[i];
		}
		b=c;
		c=0;
		for(int i=X;i<N;i++) {
			c=c+a[i];
		}
		if(b>c) {
			b=c;
		}
		System.out.println(b);
	}
}