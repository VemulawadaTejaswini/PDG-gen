import java.io.*;


public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] str = s.split(" ");
		int c1=Integer.parseInt(str[0]);
		int c2=Integer.parseInt(str[0]);
		int c3=Integer.parseInt(str[0]);
		if((55-c1-c2-c3)/7>20-c1-c2){
			System.out.println("NO");
		}
		else
			System.out.println("YES");
	}
}