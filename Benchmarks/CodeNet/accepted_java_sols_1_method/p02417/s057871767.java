import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int alph[]=new int[26];
		
		while(in.hasNext()) {
			String str=in.nextLine();char C[]=str.toCharArray();
			for(int i=0;i<C.length;i++) {
				if(C[i]>=65 && C[i]<=90)alph[C[i]-65]++;
				else if(C[i]>=97 && C[i]<=122)alph[C[i]-97]++;
			}
		}
		
		
		for(int i=0;i<26;i++) {
			char c=(char)(i+97);
			System.out.println(c+" : "+alph[i]);
		}
		out.flush();
	}

}

