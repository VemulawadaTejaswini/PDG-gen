import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			int answer = 1;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int num = Integer.parseInt(str);

			for (int i = 0; i < num; i++) {
				answer = answer * (i + 1);
			}

			System.out.println(answer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}