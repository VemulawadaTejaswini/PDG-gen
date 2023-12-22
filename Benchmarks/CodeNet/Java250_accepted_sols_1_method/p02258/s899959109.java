import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=Integer.parseInt(in.next());
		}
		
		int min=A[0],max=A[1]-A[0];
		for(int i=1;i<n;i++) {
			max=Math.max(max,A[i]-min);
			min=Math.min(min,A[i]);
		}
		System.out.println(max);
	}

}


