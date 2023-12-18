import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String[] values = readValues(br);

			int kaishi = toInt(values[0]) * 60 + toInt(values[1]);
			int shuryo = toInt(values[2]) * 60 + toInt(values[3]);
			int benkyo = toInt(values[4]);

			System.out.println(shuryo - benkyo - kaishi);

		} finally {
			br.close();
		}
	}

	private static String[] readValues(BufferedReader br) throws IOException {
		return br.readLine().split("\\s");
	}

	private static int toInt(String str) {
		return Integer.parseInt(str);
	}
}
