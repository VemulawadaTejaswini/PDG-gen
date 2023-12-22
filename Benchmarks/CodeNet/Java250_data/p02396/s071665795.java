

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int num = 0;
		String str;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		while (true) {
			str = br.readLine();
			num = Integer.parseInt(str);
			if (num == 0) {
				break;
			}
			numList.add(num);
			i++;
		}
		int length = i;
		for (i = 0; i < length; i++) {
			System.out.println("Case " + (i + 1) + ": " + numList.get(i));
		}

	}

}