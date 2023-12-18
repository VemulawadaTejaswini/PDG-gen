import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		ArrayList<Integer> HeightMountain = new ArrayList<>();
		int height = 0;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		try {
			while((line = input.readLine()) != null) {
				height = Integer.valueOf(line);
				HeightMountain.add(height);
			}
		} catch (NumberFormatException e) {
			System.out.println(line + "は整数でない");
		} catch (IOException e) {
			System.out.println("入出力例外");
		}

		Collections.sort(HeightMountain, Collections.reverseOrder());

		for(int i = 0; i < 3; i++) {
			System.out.println(HeightMountain.get(i));
		}
	}
}

