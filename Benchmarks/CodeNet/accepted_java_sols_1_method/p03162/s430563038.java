import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[][]=new int[n][3];
		int j=0;
		for(int i=0;i<n;i++) {
			ar[i][0]=s.nextInt();
			ar[i][1]=s.nextInt();
			ar[i][2]=s.nextInt();
		}
		int ans=Integer.MIN_VALUE;
		for(int i=1;i<n;i++) {
			ar[i][0]=ar[i][0]+Math.max(ar[i-1][1], ar[i-1][2]);
			ar[i][1]=ar[i][1]+Math.max(ar[i-1][0], ar[i-1][2]);
			ar[i][2]=ar[i][2]+Math.max(ar[i-1][1], ar[i-1][0]);
		}
		for(int i=0;i<3;i++)
			ans=Math.max(ans, ar[n-1][i]);
		System.out.println(ans);
	}

	
}