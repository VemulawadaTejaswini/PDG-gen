import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] sarray = line.split(" ", -1);
		int a = Integer.parseInt(sarray[0]);
		int b = Integer.parseInt(sarray[1]);
		int d = a / b;
		int r = a % b;
		float f = (float)a / b;
		System.out.println(d + " " + r + " " + String.format("%.5f", f));
	}
}