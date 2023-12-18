import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int flagN = Integer.parseInt(in.next());
			int flagK = Integer.parseInt(in.next());
			if (flagN == 0) {
				break;
			}
			int k = flagK;
			int[] array = new int[flagK];
			boolean has0 = false;
			NumTree nums = NumTree.QQQ;
			for (int i = 0; i < k; i++) {
				array[i] = Integer.parseInt(in.next());
			}
			for (int num : array) {
				if (!has0 && (num == 0)) {
					has0 = true;
				} else {
					nums = nums.put(num);
				}
			}
			System.out.println(nums.maxCount(has0));
		}
	}
}

class NumTree {
	static final NumTree QQQ = new NumTree(Integer.MAX_VALUE);
	int low, high;
	NumTree upperHigh = QQQ;

	NumTree(int num) {
		this.low = num;
		this.high = num;
	}

	int count() {
		return (high - low) + 1;
	}

	int maxCount(boolean has0) {
		if (upperHigh == QQQ) { return count(); }
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
			if ((high + 1) == upperHigh.low) {
				high = upperHigh.high;
				upperHigh = upperHigh.upperHigh;
			}
		} else if (num > high) {
			if (upperHigh != QQQ) {
				upperHigh = upperHigh.put(num);
			} else {
				upperHigh = new NumTree(num);
			}
		}
		return this;
	}