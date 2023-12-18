import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String integers = br.readLine();
			System.out.println(sort(toIntArray(integers)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int[] toIntArray(String stringArray) {
		String[] integerss = stringArray.split(" ");
		int[] IntArray = new int[5];
		IntArray[0] = Integer.parseInt(integerss[0]);
		IntArray[1] = Integer.parseInt(integerss[1]);
		IntArray[2] = Integer.parseInt(integerss[2]);
		IntArray[3] = Integer.parseInt(integerss[3]);
		IntArray[4] = Integer.parseInt(integerss[4]);
		return IntArray;
	}

	private static String sort(int[] integers) {
		int W = integers[0];
		int H = integers[1];
		int x = integers[2];
		int y = integers[3];
		int r = integers[4];
		if (x - r < 0 || y - r < 0) {
			return "No";
		} else if (x + r > W || y + r > H) {
			return "No";
		}
		return "Yes";
	}
}
