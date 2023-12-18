import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		String[] strNumArrays = br.readLine().split(" ");
		ArrayList<Integer> numArrayList = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			numArrayList.add(Integer.parseInt(strNumArrays[i]));
		}
		Collections.reverse(numArrayList);
		String out = "";
		for (int i = 0; i < numArrayList.size(); i++) {
			if (i == numArrayList.size() - 1) {
				out += numArrayList.get(i);
			} else {
				out += numArrayList.get(i) + " ";
			}
		}
		System.out.println(out);
	}

}