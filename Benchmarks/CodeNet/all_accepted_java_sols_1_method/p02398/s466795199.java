import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		int a, b, c, sum = 0;

		String[] str = new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\s+");
		
		a = Integer.parseInt(str[0]);
		b = Integer.parseInt(str[1]);
		c = Integer.parseInt(str[2]);
				
		for (int i = a; i <= b; i++) sum += c %i == 0 ? 1 : 0;
				
		System.out.println(sum);
	}
}