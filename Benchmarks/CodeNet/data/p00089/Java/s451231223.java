import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] preInts = {};
	while (in.hasNextLine()) {
	 String[] strs = in.nextLine().split(",");
	 int[] ints = new int[strs.length];
	 for (int i = 0; i < strs.length; i++) {
		ints[i] = Integer.parseInt(strs[i]);
		int left, right;
		if (preInts.length < ints.length) {
		 left = (i == 0) ? 0 : preInts[i - 1];
		 right = (i == preInts.length) ? 0 : preInts[i];
		} else {
		 left = preInts[i];
		 right = preInts[i + 1];
		}
		ints[i] += Math.max(left, right);
	 }
	 preInts = ints;
	}
	System.out.println(preInts[0]);
 }
}