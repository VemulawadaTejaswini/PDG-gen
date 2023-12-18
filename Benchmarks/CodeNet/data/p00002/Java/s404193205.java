import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] a) {

		ArrayList<Integer[]> inputs = new ArrayList<Integer[]>();

		ArrayList<Integer> outputs = new ArrayList<Integer>();

		String line;

		try {
			//            int count=0;
			boolean flg = true;
			int count = 0;

			while (flg) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				line = br.readLine();

				if (line == null || line.equals(" ") || count >= 200) {
					flg = false;
				}
				String arg1 = line.split(" ")[0];
				String arg2 = line.split(" ")[1];
				Integer[] para = { Integer.parseInt(arg1), Integer.parseInt(arg2) };
				inputs.add(para);
				count++;
			}
		} catch (Exception e) {
		}
		int sub = 0;
		for (int k = 0; k < inputs.size(); k++) {
			try {
				int num1 = inputs.get(k)[0];
				int num2 = inputs.get(k)[1];

				outputs.add(calc(num1, num2));

			} catch (Exception e) {
			}
		}

		outputResult(outputs);
	}

	private static void outputResult(List<Integer> data) {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
	}

	protected static int calc(int a, int b) {

		int sum = a + b;

		return Integer.toString(sum).length();
	}

}