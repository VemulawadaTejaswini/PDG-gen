import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		String[] in = null;
		ArrayList<Integer> Length = new ArrayList<>();
		int a, b, c;
		int numDataset;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		try {
			line = input.readLine();
		} catch (IOException e1) {
			System.out.println("最初の行における入出力例外");
		}
		numDataset = Integer.valueOf(line);

		try {
			for(int i = 0; i < numDataset; i++) {
				line = input.readLine();
				in = line.split(" ");
				for (String number : in) {
					Length.add(Integer.valueOf(number));
				}
				Collections.sort(Length, Collections.reverseOrder());

				a = Integer.valueOf(Length.get(0));
				b = Integer.valueOf(Length.get(1));
				c = Integer.valueOf(Length.get(2));
				Length.clear();

				a *= a;
				b *= b;
				c *= c;

				if(b+c == a) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println(line + "は整数でないものが含まれる");
		} catch (IOException e) {
			System.out.println("2行目以降の入出力例外");
		}

	}

}
