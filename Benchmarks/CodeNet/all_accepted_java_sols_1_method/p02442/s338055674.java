
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next()),A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());
		int m=Integer.parseInt(in.next()),B[]=new int[m];
		for(int i=0;i<m;i++)B[i]=Integer.parseInt(in.next());
		
		int size=Math.min(n, m);
		int isbig=0;
		
		for(int i=0;i<size;i++) {
			if(A[i]!=B[i]) {
				if(A[i]>B[i])isbig=-1;
				else if(A[i]<B[i])isbig=1;
				break;
			}
		}
		
		if(isbig==1 ||(isbig == 0 && n<m))System.out.println(1);
		else System.out.println(0);
	}

}

