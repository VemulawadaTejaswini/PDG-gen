import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] starray = str.split(" ");	
		int a = Integer.parseInt(starray[0]);
		int b = Integer.parseInt(starray[1]);	
	System.out.println(a/b+" "+a%b+" "+String.format("%.5f",(double) a /(double) b));
	}
}