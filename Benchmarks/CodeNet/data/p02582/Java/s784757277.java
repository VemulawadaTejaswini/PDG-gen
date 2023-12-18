import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.StringTokenizer; 

public class a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch=br.readLine().toCharArray();
		int ans=0;
		int ptr1=0;
		while(ptr1<ch.length) {
			int tmp=0;
			while(ptr1<ch.length && ch[ptr1]=='R') {
				tmp++; ptr1++;
			}
			if(ptr1<ch.length && ch[ptr1]=='S') ptr1++;
			ans=Math.max(ans,tmp);
		}
		System.out.println(ans);
	}

}