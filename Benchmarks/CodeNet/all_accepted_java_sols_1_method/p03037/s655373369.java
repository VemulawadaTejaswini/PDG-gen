import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int L[]=new int[M];
		int R[]=new int[M];
		int maxl,minr;
		int result;
		for(int i=0;i<M;i++) {
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
		}
		maxl=L[0];
		minr=R[0];
		for(int j=0;j<M;j++) {
			if(maxl<L[j]) {
				maxl=L[j];
			}
			if(minr>R[j]) {
				minr=R[j];
			}
		}
		result=minr-maxl+1;
		if(result<0) {
			result=0;
		}
		if(result>N) {
			result=N;
		}
		System.out.println(result);
	}
}