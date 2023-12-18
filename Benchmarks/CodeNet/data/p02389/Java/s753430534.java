import java.io.*;


public class Menseki {
	public static void main(String[] args) {
		String line;
		int a,b;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			line = reader.readLine();
			a = Integer.parseInt(line);
			line = reader.readLine();
			b = Integer.parseInt(line);
			System.out.println(a*b+" "+(2*a+2*b));
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
