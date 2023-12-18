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
//			int n=Integer.parseInt(br.readLine());
			String q[]=br.readLine().split(" ");
			int a[]=new int[3];
			for(int i=0;i<3;i++){
				a[i]=Integer.parseInt(q[i]);
			}
			int c=0,d=a[2];
			while(d<=a[1]) {
				if(d>=a[0]&&d<=a[1])
					c++;
//				System.out.println(d);
				d+=a[2];
//				d++;
			}
			System.out.println(c);
//		}
			
	}

}
