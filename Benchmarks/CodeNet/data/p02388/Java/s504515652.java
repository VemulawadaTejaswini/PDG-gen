import java.io.*;

class sanjo {
	public static void main(String arga[])throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	int x = Integer.parseInt(str);

	int y = x*x*x;

	System.out.println(y);
	}
}