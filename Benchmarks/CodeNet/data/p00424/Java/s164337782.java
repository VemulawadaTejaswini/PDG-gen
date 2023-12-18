import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		//For Reader
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		//Save Array and Hashmap
		ArrayList<HashMap<String, String>> alHmConvertCodeList = new ArrayList<HashMap<String, String>>();
		ArrayList<String> alDefaultString = new ArrayList<String>();
		ArrayList<StringBuffer> alConvertedStrBuff = new ArrayList<StringBuffer>();

		while(true) {

			int countOfRead = Integer.parseInt(bufferedReader.readLine());

			if (countOfRead == 0) break;

			HashMap<String, String> hmConvetCode = new HashMap<String, String>();

			for(int i = 0; i < countOfRead; i++) {
				String[] arrConvertCode = bufferedReader.readLine().split(" ");

				hmConvetCode.put(arrConvertCode[0], arrConvertCode[1]);
			}

			alHmConvertCodeList.add(hmConvetCode);

			int defaultStringLength = Integer.parseInt(bufferedReader.readLine());
			StringBuffer defaultStringBuff = new StringBuffer(defaultStringLength);

			for(int i = 0; i < defaultStringLength; i++) defaultStringBuff.append(bufferedReader.readLine());
			alDefaultString.add(defaultStringBuff.toString());
		}

		for(int i = 0; i < alDefaultString.size(); i++) {
			StringBuffer convertedStrBuff = new StringBuffer(alDefaultString.get(i).length());
			String defaultStr = alDefaultString.get(i);

			for(int j = 0; j < defaultStr.length(); i++) {
				char charAt = defaultStr.charAt(j);
				String charStr = convetCharToString(charAt);
				String convertedCharAt = alHmConvertCodeList.get(i).get(charStr) == null ?
												charStr : alHmConvertCodeList.get(i).get(charStr);
				convertedStrBuff.append(convertedCharAt);
			}

			alConvertedStrBuff.add(convertedStrBuff);
		}

		for(int i = 0; i < alConvertedStrBuff.size(); i++) System.out.println(alConvertedStrBuff.get(i).toString());

	}

	private static String convetCharToString(char charStr) {
		return String.valueOf(charStr);
	}
}

