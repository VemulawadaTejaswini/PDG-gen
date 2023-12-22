import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		try {
			buf = br.readLine();
		}
		catch(IOException e) {
			System.out.print("Read error.");
			return;
		}
		int n = Integer.parseInt(buf);
		System.out.println(n * n * n);
	}
}