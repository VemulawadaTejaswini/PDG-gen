
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),m=in.nextInt();
		int dist[][]=new int[2][n+1];
		
		for(int i=1;i<n;i++) {
			dist[0][i]=dist[0][i-1]+in.nextInt();
			dist[1][n-1-(i-1)]=dist[0][i];
		}
		
		int pos[]=new int[m+1];long L=0;
		pos[0]=0;
		for(int i=1;i<=m;i++) {
			int acl=Integer.parseInt(in.next());
			pos[i]=pos[i-1]+acl;
			if(acl>0)L+=dist[0][pos[i]]-dist[0][pos[i-1]];
			else L+=dist[0][pos[i-1]]-dist[0][pos[i]];
		}
		
		
		System.out.println(L%100000);
		
	}

}


