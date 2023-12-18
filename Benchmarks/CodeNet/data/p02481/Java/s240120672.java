import java.io.*;
public class Main {
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		System.out.println((n*m)+" "+(m+m+n+n));
	}
}
//by TTTMongolia 10/05/2012