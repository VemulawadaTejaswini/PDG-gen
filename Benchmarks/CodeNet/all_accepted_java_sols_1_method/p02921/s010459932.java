import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] yoho = br.readLine().toCharArray();
		char[] result = br.readLine().toCharArray();

		int count = 0;

		for (int i = 0; i < yoho.length; i++) {
			if (yoho[i] == result[i])
				count++;
		}

		System.out.println(count);
	}

}
