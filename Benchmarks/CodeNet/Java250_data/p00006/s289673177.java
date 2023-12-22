
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

	private static void print() {
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();


		try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();

			while (str != null) {
				String[] nums = str.split("", 0);
				int numsLength = nums.length;
				for(int iNums = 0; iNums <= numsLength - 1; iNums++){
					list.add(nums[iNums]);
				}

				Collections.reverse(list);
				int listLength = list.size();
				for(int j = 0; j <= listLength -1; j++){
					sb.append(list.get(j));
				}

				System.out.println(sb);
				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}