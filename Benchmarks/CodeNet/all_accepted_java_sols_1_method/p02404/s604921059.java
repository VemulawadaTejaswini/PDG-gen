import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = "";
		ArrayList<String> waku = new ArrayList<String>();
		while (true) {
			strNum = br.readLine();
			if ("0 0".equals(strNum)) {
				break;
			}
			for (int i = 0; i < Integer.parseInt(strNum.split(" ")[0]); i++) {
				String line = "";
				if (i == 0 || i == (Integer.parseInt(strNum.split(" ")[0]) - 1)) {
					for (int j = 0; j < Integer.parseInt(strNum.split(" ")[1]); j++) {
						line += "#";
					}
				} else {
					for (int j = 0; j < Integer.parseInt(strNum.split(" ")[1]); j++) {
						if (j == 0 || j == (Integer.parseInt(strNum.split(" ")[1]) - 1)) {
							line += "#";
						} else {
							line += ".";
						}
					}
				}
				waku.add(line);
			}
			waku.add("");
		}
		for (int i = 0; i < waku.size(); i++) {
			System.out.println(waku.get(i));
		}
	}

}