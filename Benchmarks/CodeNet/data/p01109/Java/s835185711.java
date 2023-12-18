import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		int n;
		double aver;
		int [] a=new int[10005];
		boolean p=true;
		Scanner sc=new Scanner(System.in);
		
		while(p) {
			int ans=0;
			double sum=0;
			n=sc.nextInt();
			if(n==0) break;
			for(int m=0;m<n;m++) {
				a[m]=sc.nextInt();
				sum+=a[m];
			}
			
			aver=sum/n;
			
			for(int m=0;m<n;m++) {
				if(a[m]<=aver) ans++;
			}
			System.out.printf("%d\n",ans);
		}
	}
}
