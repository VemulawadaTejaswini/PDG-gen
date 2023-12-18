import java.io.*;
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		while((n=Integer.parseInt(br.readLine())) > -1){
			System.out.println((n*n+n+2)/2);
		}
	}
}