import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine().substring(0, 1);
		String second = br.readLine().substring(1, 2);
		String third = br.readLine().substring(2, 3);
		System.out.println(first + second + third);
	}

}