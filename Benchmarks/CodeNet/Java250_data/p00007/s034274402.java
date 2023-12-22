import java.io.*;
public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double interest = 1.05; 
		double debt = 100;
		
		for (int i = 0; i < n; i++) {
			debt = Math.ceil(debt * interest);
		}
		
		System.out.println((int)(debt * 1000));
	}
}