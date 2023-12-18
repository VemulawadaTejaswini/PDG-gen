import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int seconds = Integer.parseInt(br.readLine());
			int hour 	= seconds / 3600;
			int minutes = seconds % 3600 / 60;
			seconds = seconds % 60;
			System.out.println(hour + ":" + minutes + ":" + "" +seconds);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
