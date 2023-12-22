//package gfg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			String[] s=br.readLine().split(" ");
			int l=Integer.parseInt(s[0].trim());
			int r=Integer.parseInt(s[1].trim());
			int d=Integer.parseInt(s[2].trim());
			int res=0;
			for(int i=l;i<=r;i++) {
				if(i%d==0) {
					res++;
				}
			}
			
			System.out.println(res);
			
	}

}
