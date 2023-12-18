import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int C=sc.nextInt();
		int A[][]=new int[N][M];
		int B[]=new int[M];
		int sum;
		int count=0;
		for(int i=0;i<M;i++) {
			B[i]=sc.nextInt();
		}
		for(int j=0;j<N;j++) {
			for(int k=0;k<M;k++) {
				A[j][k]=sc.nextInt();
			}
		}
		for(int l=0;l<N;l++) {
			sum=0;
			for(int m=0;m<M;m++) {
				sum+=A[l][m]*B[m];
			}
			sum+=C;
			if(sum>0) {
				count++;
			}
		}
		System.out.println(count);
	}
}