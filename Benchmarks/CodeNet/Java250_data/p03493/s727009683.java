import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int count = 0;
			String square =  br.readLine();

			for(int i = 0; i < 3; i++) {
				if(square.charAt(i) == '1') {
					count++;
				}
			}

			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
