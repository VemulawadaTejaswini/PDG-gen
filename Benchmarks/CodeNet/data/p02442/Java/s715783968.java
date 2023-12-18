import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next()),A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());
		int m=Integer.parseInt(in.next()),B[]=new int[m];
		for(int i=0;i<m;i++)B[i]=Integer.parseInt(in.next());
		
		int size=Math.max(n, m),asum=0,bsum=0;
		for(int i=0;i<n;i++)asum+=A[i]*Math.pow(10,size-i);
		for(int i=0;i<m;i++)bsum+=B[i]*Math.pow(10,size-i);
		if(bsum>asum)System.out.println(1);
		else if(bsum==asum && m>n)System.out.println(1);
		else System.out.println(0);
	}

}


