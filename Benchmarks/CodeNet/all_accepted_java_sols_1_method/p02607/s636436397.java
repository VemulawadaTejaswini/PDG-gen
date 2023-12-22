//package bigneer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			String q[]=br.readLine().split(" ");
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(q[i]);
			}
			int c=0;
		     for(int i=0;i<n;i+=2)
		    	 if(a[i]%2!=0)
		    		 c++;
		     System.out.println(c);
//		}
	}

}
