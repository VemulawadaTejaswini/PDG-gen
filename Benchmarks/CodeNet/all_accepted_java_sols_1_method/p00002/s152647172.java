import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			List<Integer> list = new ArrayList<Integer>();
			String s;

			while ((s = br.readLine()) != null && list.size() <= 200) {

				String[] num = s.split(" ");
				if (0 <= Integer.parseInt(num[0])
						&& Integer.parseInt(num[1]) <= 1000000) {
					int sum = Integer.parseInt(num[0])
							+ Integer.parseInt(num[1]);
					list.add(Integer.toString(sum).length());
				}else {
					break;
				}
			}

			for (int keta : list) {
				System.out.println(keta);
			}

		} finally {
			br.close();
		}

	}
}