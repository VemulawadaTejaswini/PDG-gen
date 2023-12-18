import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) throws IOException ,NullPointerException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String shiki = bf.readLine();
			int result = isCalc(shiki);
			if (result == -1) {
				System.out.println("NA");
			} else {
				System.out.println(result);
			}
		}
	}

	public static Integer isCalc(String s) {

		if(s.isEmpty() || !s.contains("+") || !s.contains("=")){
			return null;
		}
		
		String tmp = null;
		Integer[] numbers = new Integer[3];
		String[] tmpstr = new String[3];

	
		tmpstr[0] = s.split(Pattern.quote("+"))[0];
		tmpstr[1] = s.split(Pattern.quote("+"))[1].split(Pattern.quote("="))[0];
		tmpstr[2] = s.split(Pattern.quote("="))[1];

		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				tmp = getReplaceNum(i, tmpstr[j]);

				try {
					numbers[j] = Integer.parseInt(tmp);
				} catch (NumberFormatException nfex) {
					numbers[j] = 0;
				}
			}

			
			if (isEquals(numbers)) {
				
				return i;
			}
			
		}
		return -1;
	}

	public static String getReplaceNum(Integer num, String result) {
		result = result.replaceAll("[X]", String.valueOf(num));
		if (result.startsWith("0")) {
			result = result.replaceAll("[0]", "X");
		}
		return result;
	}

	public static boolean isEquals(Integer[] numbers) {
		if (numbers[0] + numbers[1] == numbers[2]) {
			return true;
		} else {
			return false;
		}

	}

}