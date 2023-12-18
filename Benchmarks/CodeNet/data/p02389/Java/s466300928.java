import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split("\\s");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		System.out.println(a * b + " " + 2 * a + 2 * b);
	}
}