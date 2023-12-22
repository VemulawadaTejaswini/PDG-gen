//package abc176;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static PrintWriter out;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();			
		}
		int max=a[0];
		long ans=0;
		for(int i=1;i<n;i++) {
			if(max>a[i]) {
				ans+=max-a[i];
			}
			else {
				max=Math.max(max, a[i]);
			}
		}
		out.println(ans);
		
		out.close();
		sc.close();
	}

}
