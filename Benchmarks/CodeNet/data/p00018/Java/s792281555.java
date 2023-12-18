import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			List<Integer> numList = new ArrayList<>();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();

			String str = br.readLine();
			String[] nums = str.split(" ", 0);

			for (int i = 0; i < nums.length; i++) {
				numList.add(Integer.parseInt(nums[i]));
			}
			Collections.sort(numList);
			Collections.reverse(numList);

			for (int i = 0; i < numList.size(); i++) {
				sb.append(numList.get(i));
				if (i != numList.size() -1) {
					sb.append(" ");
				}
			}

			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}