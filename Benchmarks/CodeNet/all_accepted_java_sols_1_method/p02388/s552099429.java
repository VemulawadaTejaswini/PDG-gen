import java.io.*;


public class Main {  
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		double num = Double.parseDouble(line);
		double ans = Math.pow(num, (double)3);
		System.out.println((int)ans);
	}
}