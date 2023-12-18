import java.io.*;


public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n >= 30) System.out.println("Yes");
		else System.out.println("No");
	}
}
