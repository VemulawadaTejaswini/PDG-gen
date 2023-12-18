import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double r = Integer.parseInt(str);
		System.out.println(r*r*3.14159+" "+r*3.14159*2);
	}

}