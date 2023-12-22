import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			int in = Integer.parseInt(br.readLine());
			 System.out.println(in==3||in==5||in==7?"YES":"NO");
		}
	}
}