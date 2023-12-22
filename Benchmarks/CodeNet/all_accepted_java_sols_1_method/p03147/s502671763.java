import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int x[]=new int[N];
		int y[]=new int[N];
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=x[i];
		}
		int sum=0;

		for(int i=0;i<N;i++) {
			if(i!=N-1) {
				if(y[i]<=x[i+1]) {
					y[i]=0;
				}
			}
			if(i!=0) {
				if(y[i]<x[i-1]) {
					y[i]=0;
				}
			}
			sum+=y[i];
		}
		Boolean j=false;
		int min=0;
		for(int i=0;i<N;i++) {
			if(y[i]!=0) {
				j=true;
			}
			if(j) {
				if(y[i]==0) {
					if(min>x[i]) {
						min=x[i];
					}
				}else {
					sum-=min;
					min=101;
				}
			}
		}
		System.out.println(sum);
	}
}