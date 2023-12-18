import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder b = new StringBuilder();

		String str;
		str = null;
		
		int i;
		i = 0;

		do {
			i++;
			str = br.readLine();
			//b.append("Case ").append(Integer.toString(i)).append(": ").append(str).append("\n");
			System.out.println("Case " + Integer.toString(i) + ": " + str);
		} while(Integer.parseInt(str) != 0);

		

	}
}