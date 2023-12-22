import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			Arrays.sort(chr);

			 System.out.println(chr[0].equals(chr[1])
					 &&chr[2].equals(chr[3])
					 &&!(chr[0].equals(chr[2]))?"Yes":"No");
		}
	}
}