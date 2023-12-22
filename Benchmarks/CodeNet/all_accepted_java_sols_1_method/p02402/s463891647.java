import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		String[] inNumArrays = br.readLine().split(" ");
		long sum = 0;
		ArrayList<Integer> numArrayList = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			numArrayList.add(Integer.parseInt(inNumArrays[i]));
			sum += Integer.parseInt(inNumArrays[i]);
		}
		Collections.sort(numArrayList);
		System.out.println(numArrayList.get(0) + " " + numArrayList.get(numArrayList.size()-1) + " " + sum);
	}
}