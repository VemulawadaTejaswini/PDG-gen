import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			if(in.equals("1")) {
				System.out.println("Hello World");

			}else {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				System.out.println(a+b);

			}
		}
	}
}