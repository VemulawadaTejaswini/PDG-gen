import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		int a=0;
		int b=0;
		int c=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			for(int k=i+1;k<N;k++) {
				if(A[i]<A[k]) {
					c=A[k];
					A[k]=A[i];
					A[i]=c;
				}
			}
		}
		for(int i=0;i<N;i++) {
			a=a+A[i];
			i=i+1;
			if(i<N) {
				b=b+A[i];
			}
		}
		System.out.println(a-b);
	}
}