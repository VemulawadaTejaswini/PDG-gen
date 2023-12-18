import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			List<String> ret = new LinkedList<String>();
			int m, f, r;
			do {
				String[] inputList = br.readLine().split(" ");
				m = Integer.parseInt(inputList[0]);
				f = Integer.parseInt(inputList[1]);
				r = Integer.parseInt(inputList[2]);
				if (m == -1 && f == -1 && r == -1) {
					break;
				} else if ((m == -1 || f == -1) || m + f < 30) {
					ret.add("F");
				} else if (m + f < 50 && r < 50) {
					ret.add("D");
				} else if ((m + f < 50 && r >= 50) || m + f < 65) {
					ret.add("C");
				} else if (m + f < 80) {
					ret.add("B");
				} else {
					ret.add("A");
				}
			} while (true);
			for (String text : ret) {
				System.out.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}