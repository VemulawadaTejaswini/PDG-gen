
import java.util.*;

class Main{
	
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);

	int n=s.nextInt();
	int a[]=new int[n+1];
	a[1]=1;
	int b[]= {6,9};
	for(int i=2;i<=n;i++) {
		a[i]=Integer.MAX_VALUE;
		a[i]=Math.min(a[i-1]+1,a[i]);
		for(int j=1;j<n&&Math.pow(6, j)<=i;j++) {
			a[i]=Math.min(a[i], a[i-(int)Math.pow(6,j)]+1);
		}
		for(int j=1;j<n&&Math.pow(9, j)<=i;j++) {
			a[i]=Math.min(a[i], a[i-(int)Math.pow(9,j)]+1);
		}
		
	}
	System.out.println(a[n]);
	
}




}
