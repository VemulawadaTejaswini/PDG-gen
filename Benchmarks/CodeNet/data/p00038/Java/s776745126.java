import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static String solve (int[] hand) {
		Arrays.sort(hand);
		int[] check = new int[14];
		for (int i = 0; i < hand.length; i++)
			check[hand[i]]++;
		int pair2 = 0, pair3 = 0, pair4 = 0;
		for (int i = 1; i < check.length; i++) {
			if (check[i] == 2) pair2++;
			if (check[i] == 3) pair3++;
			if (check[i] == 4) pair4++;
		}
		if (pair4 == 1) return "four card";
		if (pair3 == 1 && pair2 == 1) return "full house";

		boolean straightFlg = true;
		for (int i = 1; i < hand.length; i++) {
			if (hand[i] != hand[i - 1] + 1) {
				straightFlg = false;
				break;
			}
		}
		boolean straightFlg2 = hand[0] == 1 && hand[1] == 10 &&
							   hand[2] == 11 && hand[3] == 12 && hand[4] == 13;
		if (straightFlg || straightFlg2) return "straight";
		if (pair3 == 1) return "three card";
		if (pair2 == 2) return "two pair";
		if (pair2 == 1) return "one pair";
		return "null";
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			int[] nums = new int[5];
			for (int i = 0; i < nums.length; i++)
				nums[i] = Integer.parseInt(str[i]);
			System.out.println(solve(nums));
			line = null;
		}

	}

}