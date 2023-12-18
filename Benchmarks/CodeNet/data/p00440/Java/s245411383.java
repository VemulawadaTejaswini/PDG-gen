import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int flagN = in.nextInt();
		int flagK = in.nextInt();
		while ((flagN != 0) && (flagK != 0)) {
			final int k = flagK;
			boolean has0 = false;
			NumTree nums = null;
			for (int i = 0; i < k; i++) {
				int num = in.nextInt();
				if (!has0 && (num == 0)) {
					has0 = true;
				} else if (nums == null) {
					nums = new NumTree(num);
				} else {
					nums = nums.put(num);
				}
			}
			System.out.println(nums);
			System.out.println(nums.maxCount(has0));
			flagN = in.nextInt();
			flagK = in.nextInt();
		}
	}
}

class NumTree {
	int low, high;
	NumTree upperHigh = null;

	NumTree(int num) {
		this.low = num;
		this.high = num;
	}

	int count() {
		return (high - low) + 1;
	}

	int maxCount(boolean has0) {
		if (upperHigh == null) { return count(); }
		int upperMax = upperHigh.maxCount(has0);
		int count = count();
		if (has0 && ((upperHigh.low - 2) == high)) {
			count += upperHigh.count() + 1;
		}
		return Math.max(upperMax, count);
	}

	NumTree put(int num) {
		if (num <= (low - 2)) {
			NumTree result = new NumTree(num);
			result.upperHigh = this;
			return result;
		}
		if (num == (low - 1)) {
			low = num;
		} else if (num == (high + 1)) {
			high = num;
			if ((upperHigh != null) && ((high + 1) == upperHigh.low)) {
				high = upperHigh.high;
				upperHigh = upperHigh.upperHigh;
			}
		} else if (num > high) {
			if (upperHigh != null) {
				upperHigh = upperHigh.put(num);
			} else {
				upperHigh = new NumTree(num);
			}
		}
		return this;
	}
}