import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));
		String line=br.readLine();
		String[] str = line.split(" ");
		Arrays.sort(str);
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		int c=Integer.parseInt(str[2]);
		System.out.println(a+" "+b+" "+c);
	}
}