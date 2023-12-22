import java.io.*;
public class Main {
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		if(n==m)System.out.println("a == b");
		if(n>m)System.out.println("a > b");
		if(n<m)System.out.println("a < b");
	}
}
//by TTTMongolia 10/05/2012