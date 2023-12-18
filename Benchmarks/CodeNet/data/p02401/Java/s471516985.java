import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strIn = "";
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		while (true) {
			strIn = br.readLine();
			if ("?".equals(strIn.split(" ")[1])) {
				break;
			}
			if ("+".equals(strIn.split(" ")[1])) {
				numArray.add(Integer.parseInt(strIn.split(" ")[0]) + Integer.parseInt(strIn.split(" ")[2]));
			} else if ("-".equals(strIn.split(" ")[1])) {
				numArray.add(Integer.parseInt(strIn.split(" ")[0]) - Integer.parseInt(strIn.split(" ")[2]));
			} else if ("*".equals(strIn.split(" ")[1])) {
				numArray.add(Integer.parseInt(strIn.split(" ")[0]) * Integer.parseInt(strIn.split(" ")[2]));
			} else if ("/".equals(strIn.split(" ")[1])) {
				numArray.add(Integer.parseInt(strIn.split(" ")[0]) / Integer.parseInt(strIn.split(" ")[2]));
			}
		}
		for (int i = 0; i < numArray.size(); i++) {
			System.out.println(numArray.get(i));
		}
	}
}