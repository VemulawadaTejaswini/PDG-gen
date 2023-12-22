import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer t=new StringTokenizer(re.readLine());
		//int a=Integer.parseInt(t.nextToken()),b=Integer.parseInt(t.nextToken()),k=Integer.parseInt(t.nextToken());
		String str=re.readLine();
		int a=0;
		for(int i=0;i<str.length();++i) {
			if(str.charAt(i)=='1')++a;
		}
		System.out.println(2*Math.min(a,str.length()-a));
	}
}
