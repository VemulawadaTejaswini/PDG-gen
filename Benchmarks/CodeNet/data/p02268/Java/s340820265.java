import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++) A[i]=Integer.parseInt(in.next());
		
		int q=in.nextInt(),cnt=0;
		for(int i=0;i<q;i++) {
			if(binarySearch(A,Integer.parseInt(in.next())))cnt++;
		}
		System.out.println(cnt);
	}
	
	static boolean binarySearch(int[] A,int q) {
		int L=0,R=A.length-1;
		while(R>=L) {
			int M=(L+R)/2;
			if(A[M]==q)return true;
			else if(A[M]<q)L=M+1;
			else R=M-1;
		}
		return false;
	}

}

