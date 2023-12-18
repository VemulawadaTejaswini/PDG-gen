import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Top3Mountains {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> heights = new ArrayList<>();
		int x;
		for (int i = 0; i < 10; i++) {
			x = Integer.parseInt(br.readLine());
			if (0 <= x && x <= 10000) {
				heights.add(x);
			}
		}

		int[] top3 = getTop3(heights);
		for (int i = 0; i < top3.length; i++) {
			System.out.println(top3[i]);
		}
	}

	private static int[] getTop3(ArrayList<Integer> heights) {
		int[] top3 = new int[3];
		top3[0] = 0; // 1st highest
		top3[1] = 0; // 2rd highest
		top3[2] = 0; // 3rd highest
		for (int i = 0; i < heights.size(); i++) {
			int element = heights.get(i);
			if (element > top3[0]) {
				top3[2] = top3[1];
				top3[1] = top3[0];
				top3[0] = element;
			} else if (element > top3[1]) {
				top3[2] = top3[1];
				top3[1] = element;
			} else if (element > top3[2]) {
				top3[2] = element;
			}
		}
		return top3;
	}
}