import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String yohou = stdin.readLine();
		String jissai = stdin.readLine();
		String[] yohouArr = convertArr(yohou);
		String[] jissaiArr = convertArr(jissai);
		System.out.println(checkTenki(yohouArr, jissaiArr));

	}

	private static String[] convertArr(String str) {
		String[] strArr = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			strArr[i] = str.substring(i, i + 1);
		}
		return strArr;
	}

	private static int checkTenki(String[] strArr1, String[] strArr2) {
		int count = 0;
		for (int i = 0; i < strArr1.length; i++) {
			if (strArr1[i].equals(strArr2[i])) {
				count++;
			}
		}
		return count;
	}
}