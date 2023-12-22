import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		int i,j,k,cc=0;
		int[]a=new int[m];
		int[][]b=new int [n][m]; 
		
		for(k=0;k<m;k++) {
			a[k]=sc.nextInt();
		}
		
		for( i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		int []ans=new int[n];
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				ans[i]+=b[i][j]*a[j];
			}
			ans[i]+=c;
		}
		
		for(i=0;i<n;i++) {
			if(ans[i]>0) {
				cc++;
			}
		}
		System.out.println(cc);
		
	}

}
