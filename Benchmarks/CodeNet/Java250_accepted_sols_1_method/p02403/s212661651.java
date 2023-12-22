import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = "";
		ArrayList<String> squea = new ArrayList<String>();
		while (true) {
			strNum = br.readLine();
			if ("0 0".equals(strNum)) {
				break;
			}
			for (int i = 0; i < Integer.parseInt(strNum.split(" ")[0]); i++) {
				String line = "";
				for (int j = 0; j < Integer.parseInt(strNum.split(" ")[1]); j++) {
					line += "#";
				}
				squea.add(line);
			}
			squea.add("");
		}
		for (int i = 0; i < squea.size(); i++) {
			System.out.println(squea.get(i));
		}
	}

}