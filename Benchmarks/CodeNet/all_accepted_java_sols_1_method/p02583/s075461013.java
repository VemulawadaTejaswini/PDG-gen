import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] l = new int[n];
		for ( int i=0; i<n; i++ ) l[i] = sc.nextInt();

		int g=0;
		for ( int i=0; i<n; i++ ) {
		for ( int j=i+1; j<n; j++ ) {
			if ( l[i]==l[j] ) continue;
			int kmax = l[i]+l[j] ;
			int kmin = (int)Math.abs(l[i]-l[j]);

			for ( int k=j+1; k<n; k++ ) {
				if ( (l[k]-l[i])*(l[k]-l[j])==0 ) continue;
				if ( l[k]<=kmin || l[k]>=kmax ) continue;
				g++;
			}
		}
		}

		System.out.println(g);
	}
}