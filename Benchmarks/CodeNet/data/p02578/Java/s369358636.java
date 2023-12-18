import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		int d[]=new int [N];
		int sum=0;
		for(int i=0;i<N;++i) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;++i) {
			
			if(A[i]>A[i+1]) {
				d[i]=A[i]-A[i+1];
				A[i+1]+=d[i];
			}else {
				d[i]=0;
			}
		
		}
		for(int i=0;i<N;++i) {
		 sum+=d[i];
		}
		System.out.println(sum);
		
		
		
	}

}
