import java.io.*;
public class Main{
	public static void main(String [] args) throws  IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int a=Integer.parseInt(st[0]);
		int b=Integer.parseInt(st[1]);

		System.out.printf("%d %d %.6f",a/b,a%b,(double)a/b);
		}
	}