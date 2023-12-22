import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;

			ArrayList<Integer> number = new ArrayList<Integer>();
			ArrayList<Long> outCome = new ArrayList<Long>();

			for (int i = 0; i < n; i++) {
				String[] str = br.readLine().split(" ");
				int num = Integer.parseInt(str[0]);
				long price = Integer.parseInt(str[1]);
				long cnt = Integer.parseInt(str[2]);
				if (number.contains(num)) {
					int index = number.indexOf(num);
					outCome.set(index, outCome.get(index) + (price * cnt));
				} else {
					number.add(num);
					outCome.add(price * cnt);
				}
			}
			boolean naFlg = true;
			for (int j = 0; j <outCome.size(); j++) {
				if (outCome.get(j) >= 1000000) {
					naFlg = false;
					System.out.println(number.get(j));
				}
			}
			if (naFlg) System.out.println("NA");
		}

	}

}