import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		long a= Long.parseLong(data[0]);
		long b= Long.parseLong(data[1]);
		System.out.printf("%d %d %6f", (int)(a/b),(int)(a%b),(double)(a/b));
	}
}