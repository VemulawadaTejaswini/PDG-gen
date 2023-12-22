import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
//    BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1);
		String s =r.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int a,b,c,t;
		a = Integer.parseInt(st.nextToken().toString());
		b = Integer.parseInt(st.nextToken().toString());
		c = Integer.parseInt(st.nextToken().toString());
		if(a>b){
			t=a;a=b;b=t;
			
//		System.out.println(a+" "+b+" "+c+"a:b");
		}
		if(a>c){
			t=a;a=c;c=t;
			
//		System.out.println(a+" "+b+" "+c+"a:c");
		}
		if(b>c){
			t=c;c=b;b=t;
			
//		System.out.println(a+" "+b+" "+c+"b:c");
		}
		System.out.println(a+" "+b+" "+c);
	}
}