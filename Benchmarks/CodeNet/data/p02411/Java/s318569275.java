import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> scoreArrays = new ArrayList<String>();
		while (true) {
			String strTensu = br.readLine();
			if ("-1 -1 -1".equals(strTensu)) {
				break;
			}
			String[] strTensuArrays = strTensu.split(" ");
			Integer totalScore = Integer.parseInt(strTensuArrays[0]) + Integer.parseInt(strTensuArrays[1]);
			if (!"-1".equals(strTensuArrays[0]) && !"-1".equals(strTensuArrays[1])) {
				if (80 <= totalScore) {
					scoreArrays.add("A");
				} else if (totalScore < 80 && 65 <= totalScore ) {
					scoreArrays.add("B");
				} else if (totalScore < 65 && 50 <= totalScore ) {
					scoreArrays.add("C");
				} else if (totalScore < 50 && 30 <= totalScore ) {
					if (50 <= Integer.parseInt(strTensuArrays[2])) {
						scoreArrays.add("C");
					} else {
						scoreArrays.add("D");
					}
				} else {
					scoreArrays.add("F");
				} 
			} else {
				scoreArrays.add("F");
			}
		}
		for (int i = 0; i < scoreArrays.size(); i++) {
			System.out.println(scoreArrays.get(i));
		}
	}

}