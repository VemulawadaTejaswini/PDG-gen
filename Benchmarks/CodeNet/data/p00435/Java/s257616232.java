import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int RECT_COUNT = 0;
	public static final int Q_NUMBER = 1;


	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String beforeStr = bufferedReader.readLine();
		String afterAtr = "";

		for(int i = 0; i < beforeStr.length(); i++) {
			switch(getStringCharAt(beforeStr, i)) {
				case "X" : afterAtr += "A"; break;
				case "Y" : afterAtr += "B"; break;
				case "Z" : afterAtr += "C"; break;
				default:
					afterAtr += String.valueOf((char)(beforeStr.charAt(i) + 3));
			}
		}

		System.out.println(afterAtr);
	}

	public static String getStringCharAt(String str, int position) {
		return String.valueOf(str.charAt(position));
	}

	public static String[] getStringCharArr(String str) {

		String[] arrResult = new String[str.length()];

		for(int i = 0; i < str.length(); i++) arrResult[i] = getStringCharAt(str, i);

		return arrResult;
	}

	public static boolean isInnerPosition(int x1, int x2, int searchPosition) {
		return x1 <= searchPosition && searchPosition <= x2;
	}

}