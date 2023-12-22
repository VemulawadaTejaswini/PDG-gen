import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str1 = line.split(" ", -1);
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		int d = a / b;
		int r = a % b;
		double f = ((double)a / (double)b);
		System.out.println(d);
		System.out.println(r);
		System.out.printf("%.5f",f);
		System.out.println();
	}
}