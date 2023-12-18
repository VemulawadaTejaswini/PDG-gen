import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
		Scanner  sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
	char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int n=sc.nextInt();
	String s[]=new String[n];
	for(int i=0;i<n;i++) {
		s[i]=sc.next();
	}
	String ans="";
	for(char alp:a) {
	
		int ans1=100;
		for(int i=0;i<n;i++) {
			int count=0;
			for(char x:s[i].toCharArray()) {
				if(x==alp) {
					count++;
				}
			}
			ans1=Math.min(ans1,count);
		}
		for(int i=0;i<ans1;i++) {
			ans+=alp;
		}
	}
	out.println(ans);
	out.flush();
	
}
}