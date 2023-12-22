import java.io.*;
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n = 0;
		while((str=br.readLine()) != null){
			n=Integer.parseInt(str);
			System.out.println((n*n+n+2)/2);
		}
	}
}