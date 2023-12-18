import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	private static final int NO_VALUE = -1;

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			Header header = new Header(reader);

			// ????????????
			if (header.finish()) {
				break;
			}

			// ????????????????????????
			HintList hint = new HintList(header, reader);

			// ??????????????§??????
			searchAnswer(header.length, hint);
			System.out.println(hint.result);

		}
		reader.close();
	}

	static class Header {
		public int length;
		public int numberOfHint;

		public Header(BufferedReader reader) throws Exception {
			String[] splittedLine = reader.readLine().split(" ");
			length = Integer.parseInt(splittedLine[0]);
			numberOfHint = Integer.parseInt(splittedLine[1]);
		}

		public boolean finish() {
			return length == 0 && numberOfHint == 0;
		}
	}

	static class HintList {
		public Hint[] hintList;
		public String result = "NO";

		public HintList(Header header, BufferedReader reader) throws Exception {
			hintList = new Hint[header.numberOfHint];
			for (int i = 0; i < header.numberOfHint; i++) {
				int[] trial = new int[header.length];
				String[] line = reader.readLine().split(" ");
				for (int j = 0; j < line[0].length(); j++) {
					trial[j] = Character.digit(line[0].charAt(j), 10);
				}
				Hint hint = new Hint(trial, Integer.parseInt(line[1]),
						Integer.parseInt(line[2]));
				hintList[i] = hint;
			}
		}

		public void setResult(int[] digits) {
			if (!result.equals("NO")) {
				result = "NO";
			} else {
				StringBuilder builder = new StringBuilder();
				for (int digit : digits) {
					builder.append(digit);
				}
				result = builder.toString();
			}
		}
	}

	static class Hint {
		public int[] trial;
		public int hit;
		public int blow;

		public Hint(int[] trial, int hit, int blow) {
			this.trial = trial;
			this.hit = hit;
			this.blow = blow;
		}

		public boolean match(int[] target) {
			// ???????????¨????????????????????????
			int actualHit = 0;
			int actualBlow = 0;
			for (int i = 0; i < target.length; i++) {

				// ???????????????
				if (trial[i] == target[i]) {
					actualHit++;
					continue;
				}

				// ???????????????
				for (int j = 0; j < target.length; j++) {
					if (trial[i] == target[j]) {
						actualBlow++;
						break;
					}
				}

			}
			return hit == actualHit && blow == actualBlow;
		}
	}

	public static void searchAnswer(int length, HintList hintList) {

		int[] digits = new int[length];
		Arrays.fill(digits, NO_VALUE);

		for (int i = 0; i < 10; i++) {
			recursiveCreateDigits(0, digits, i, hintList);
		}
	}

	public static void recursiveCreateDigits(int index, int[] digits, int next,
			HintList hintList) {

		// ?????¨?????????????????????????????????
		boolean[] used = new boolean[10];
		for (int i = 0; i < index; i++) {
			if (digits[i] == NO_VALUE) {
				break;
			}
			used[digits[i]] = true;
		}

		// ??°?????????????????????????????????
		if (index == digits.length - 1) {
			digits[index] = next;

			// ????????§??????????????????????????????
			boolean allMatch = true;
			for (int j = 0; j < hintList.hintList.length; j++) {
				if (!hintList.hintList[j].match(digits)) {
					allMatch = false;
					break;
				}
			}
			if (allMatch) {
				hintList.setResult(digits);
			}
			// showDigits(digits);
			// System.out.println();
			return;
		}

		// ???????????´?????????????¨???????????¬??????????
		digits[index] = next;
		used[next] = true;
		for (int i = 0; i < 10; i++) {
			// ???????????§????????????????????????????????????
			if (used[i]) {
				continue;
			}
			recursiveCreateDigits(index + 1, digits, i, hintList);
		}

	}

	public static void showDigits(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i]);
		}
	}
}