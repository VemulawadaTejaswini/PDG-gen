import java.io.*;

public class Main{
	public static void main(String[] atgs){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int num = Integer.parseInt(line);
		System.out.println(num * num);
	}
}
