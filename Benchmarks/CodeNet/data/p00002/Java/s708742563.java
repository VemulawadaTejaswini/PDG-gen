import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static BufferedReader input =
			new BufferedReader (new InputStreamReader (System.in));
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] a) throws IOException {
		for (int i = 0; i < 200; ++i) {
			Integer num1 = 0, num2 = 0;
			String str = input.readLine();
			if (str.equals("")) {
				break;
			}
			try {
				num1 = Integer.parseInt(str.split("\\s")[0]);
				num2 = Integer.parseInt(str.split("\\s")[1]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.exit(1);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.exit(1);
			}
			list.add(num1 + num2);
		}
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(String.valueOf(list.get(i)).length());
		}
	}
}