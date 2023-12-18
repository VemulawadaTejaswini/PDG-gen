
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			int length = Integer.parseInt(str) - 1;

			str = br.readLine();
			while (true) {

				String[] dataSet = str.split(" ", 0);
				String[] dataSetReverse;
				dataSetReverse = new String[length];

				for (int i = 0; i <= length; i++) {
					dataSetReverse[length - i] = dataSet[i];
				}
				for (int j = 0; j <= length; j++) {
					sb.append(dataSetReverse[j]);
				}
				System.out.println(sb);
				str = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}