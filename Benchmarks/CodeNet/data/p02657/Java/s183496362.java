//package bigneer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine());
			String q[]=br.readLine().split(" ");
			int a=Integer.parseInt(q[0]);
			int b=Integer.parseInt(q[1]);
			System.out.println(a*b);
//			int a[]=new int[n];
//			for(int i=0;i<n;i++)
//				a[i]=Integer.parseInt(q[0]);
//			System.out.println();
//		}
	}

}
