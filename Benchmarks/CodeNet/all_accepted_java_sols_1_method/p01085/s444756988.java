import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			int nmin=in.nextInt(),nmax=in.nextInt(),A[]=new int[n];
			for(int i=0;i<n;i++)A[i]=in.nextInt();
			int max=0,res=0;
			for(int i=nmin-1;i<nmax;i++) {
				if(A[i]-A[i+1]>=max) {
					max=A[i]-A[i+1]; res=i;
				}
			}
			System.out.println(res+1);
		}
	}

}
