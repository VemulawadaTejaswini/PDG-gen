import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		int x;
		String s;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		s = buf.readLine();
		x=Integer.parseInt(s);
		
		System.out.println(x*x*x);
		
		
		
		
	}

}