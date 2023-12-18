import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> mountain = new ArrayList<Integer>();
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));

			int line;
			for (int i = 0; i < 10; i++) {
				line = Integer.parseInt(stdReader.readLine());
				mountain.add(line);
			}

			Collections.sort(mountain);

			for (int i = 9; i >= 7; i--) {
				System.out.println(mountain.get(i));
			}
		} catch (IOException e) {

		}
	}
}