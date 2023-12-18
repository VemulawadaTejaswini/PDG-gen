import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());
		
		int res[]=countingSort(A);
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n-1;i++)out.print(res[i]+" ");
		out.println(res[n-1]);
		
		out.flush();
	}
	
	static int[] countingSort(int[] A) {
		int max=0,cnt[]=new int[10001],res[]=new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			cnt[A[i]]++;
			if(A[i]>max)max=A[i];
		}
		
		for(int i=1;i<=max;i++)cnt[i]+=cnt[i-1];
				
		for(int i=A.length-1;i>=0;i--) {
			int v=A[i];
			cnt[v]--;
			res[cnt[v]]=v;
		}
		
		return res;
	}

}

