import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = "";
		ArrayList<String> numArray = new ArrayList<String>();
		while(true) {
			strNum = br.readLine();
			if (strNum.equals("0")) {
				break;
			}
			numArray.add(strNum);
		}
		for (int i = 0; i < numArray.size(); i++) {
			System.out.println("Case " + (i+1) +": " + numArray.get(i));
		}
	}

}