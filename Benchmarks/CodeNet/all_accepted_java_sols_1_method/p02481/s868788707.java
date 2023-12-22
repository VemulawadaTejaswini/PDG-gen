import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] in = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int a = Integer.parseInt(in[0]);
		int b = Integer.parseInt(in[1]); 
		System.out.println((a*b) + " " + (2*(a+b)));
	}	
}