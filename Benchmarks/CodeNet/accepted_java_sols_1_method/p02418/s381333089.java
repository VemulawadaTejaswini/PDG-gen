import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			String circleStr = br.readLine();
			String answer = br.readLine();
			int circleLen = circleStr.length();
			int answerLen = answer.length();
			String result = "No";
			for (int i = 0; i < circleLen; i++) {
				char c = circleStr.charAt(i);
				int cIndex = i;
				for (int j = 0; j < answerLen; j++) {
					if (c == answer.charAt(j)) {
						if (answerLen - 1 == j) {
							result = "Yes";
							break;
						}
						if (circleLen - 1 == cIndex) {
							cIndex = 0;
						} else {
							cIndex++;
						}
						c = circleStr.charAt(cIndex);
					} else {
						break;
				}
					}
				if (result.equals("Yes")) break;
			}
			System.out.println(result);
		} while (br.ready());
	}	
}