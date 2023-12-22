import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> countArrayList = new ArrayList<Integer>();
		while (true) {
			Integer count = 0;
			String strNum = br.readLine();
			if ("0 0".equals(strNum)) {
				break;
			}
			String[] strNumArrays = strNum.split(" ");
			Integer sum = 0;
			for (int i = 1; i <= Integer.parseInt(strNumArrays[0]); i++) {
				for (int j = i + 1; j <= Integer.parseInt(strNumArrays[0]); j++) {
					for (int k = j + 1; k <= Integer.parseInt(strNumArrays[0]); k++) {
						sum = i + j + k;
						if (sum == Integer.parseInt(strNumArrays[1])) {
							count++;
						}
					}
				}
			}
			countArrayList.add(count);
		}
		for (int i = 0; i < countArrayList.size(); i++) {
			System.out.println(countArrayList.get(i));
		}
	}
}