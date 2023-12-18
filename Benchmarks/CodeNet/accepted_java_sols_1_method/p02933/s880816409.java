import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			int a = Integer.parseInt(br.readLine());
			String s = br.readLine();

			System.out.println(a>=3200?s:"red");
		}
	}
}