import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null) {
			if (line.equals("0")) {
				break;
			}
			
			int sum = 0;
			for (char c : line.toCharArray()) {
				sum += c - '0';
			}
			
			System.out.println(sum);
		}
	}

}