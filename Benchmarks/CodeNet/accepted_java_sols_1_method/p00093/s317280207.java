import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null && !str.equals("0 0")) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (int j = 0; j < array.size(); j++) {
			String[] data = array.get(j).split(" ");
			int from = Integer.parseInt(data[0]);
			int to = Integer.parseInt(data[1]);
			ArrayList<Integer> answer = new ArrayList<Integer>();
			for (int i = 0; from + i <= to; i++) {
				if (((from + i) % 400 == 0) || ((from + i) % 4 == 0)
						&& ((from + i) % 100 != 0)) {
					answer.add(from + i);
				}
			}
			if (answer.size() == 0) {
				System.out.println("NA");
			} else {
				for (int i : answer) {
					System.out.println(i);
				}
			}
			if(j + 1 != array.size())
				System.out.println();
		}
	}

}