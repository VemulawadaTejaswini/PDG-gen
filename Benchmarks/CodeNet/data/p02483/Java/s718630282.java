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

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] nums = str.split(" ", 0);

			List<Integer> list = new ArrayList<>();

			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			int c = Integer.parseInt(nums[2]);

			list.add(a);
			list.add(b);
			list.add(c);

			Collections.sort(list);


	        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}