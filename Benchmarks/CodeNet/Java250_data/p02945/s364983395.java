import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String in[] = new String[2];
		int a = 0, b = 0;
		try {
			line = br.readLine();
			in = line.split(" ");
			a = Integer.parseInt(in[0]);
			b = Integer.parseInt(in[1]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int max = a + b;
		int tmp;
		if (max < (tmp = a - b)) {
			max = tmp;
		}
		
		if (max < (tmp = a * b)) {
			max = tmp;
		}
		
		System.out.println(max);
	}

}