import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		String a = "";
		Integer count = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			a = br.readLine();
		}
		for(char x:a.toCharArray()) {
			if(x == '2') {
				count++;
			}
		}
		System.out.println(count);
	}
}