import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		String[] strNumArrays = strNum.split(" ");
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < strNumArrays.length; i++) {
			numList.add(Integer.parseInt(strNumArrays[i]));
		}
		Collections.sort(numList);
		String out = String.valueOf(numList.get(0));
		for (int i = 1; i < numList.size(); i++) {
			out += " " + numList.get(i);
		}
		System.out.println(out);
	}

}