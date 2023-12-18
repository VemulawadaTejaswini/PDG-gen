import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),A[]=new int[n];
		A[0]=Integer.parseInt(in.next());
		int min=A[0],pos=0;
		for(int i=1;i<n;i++) {
			A[i]=Integer.parseInt(in.next());
			if(A[i]<min && i<n-1) {
				min=A[i];
				pos=i;
			}
		}
		
		int max=A[pos+1]-A[pos];
		for(int i=pos+2;i<n;i++) {
			max=Math.max(max,A[i]-A[pos]);
		}
		System.out.println(max);
	}

}

