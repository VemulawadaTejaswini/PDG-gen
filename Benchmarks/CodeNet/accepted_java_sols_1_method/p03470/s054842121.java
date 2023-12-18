import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int d[]=new int [N];
		for(int i=0;i<N;i++) {
			d[i]=sc.nextInt();
		}
		int a=0;
		for(int i=0;i<N-1;i++) {
			for(int k=i+1;k<N;k++) {
				if((d[i]>0)&&(d[i]==d[k])){
					d[k]=0;
					a=a+1;
				}
			}
		}
		System.out.println(N-a);
	}
}