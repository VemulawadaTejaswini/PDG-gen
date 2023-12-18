import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.valueOf(br.readLine()).intValue();
		System.out.print((int)Math.pow(x,3)+System.getProperty("line.separator"));
	}
}