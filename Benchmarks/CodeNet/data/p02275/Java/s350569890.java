import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int SIZE = 2000000;

	static public void main(String[] args) throws IOException {
		// ??\????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ????卒???属?????\??贈???????????????????卒???属????????????????????????????????則????????即???
		br.readLine();
		String line = br.readLine();
		// ???????????????
		int[] beforeSort = parseInt(getSplitLine(line));

		int[] count = new int[SIZE];
		int[] offset = new int[SIZE];
		int[] afterSort = new int[SIZE];
		for (int i = 0; i < beforeSort.length; i++) {
			count[beforeSort[i]]++;
		}

		// offset?即????
		for (int i = 1; i < SIZE; i++) {
			offset[i] = offset[i - 1] + count[i - 1];
		}

		// ???????????????
		for (int i = 0; i < beforeSort.length; i++) {
			afterSort[offset[beforeSort[i]]] = beforeSort[i];
			offset[beforeSort[i]]++;
		}

		outPut(afterSort);
	}

	// ????????????????????????
	private static void outPut(int[] in) {
		boolean isEnd = false;
		String message = null;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0 && isEnd) {
				break;
			}
			if (i == 0) {
				message = String.valueOf(in[i]);
				continue;
			}
			if (in[i] > 0) {
				isEnd = true;
			}
			message += " " + String.valueOf(in[i]);
		}
		System.out.print(message);
	}

	private static String[] getSplitLine(String line) {
		return line.split("\\s");
	}

	private static int[] parseInt(String[] line) {
		int[] numArray = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			numArray[i] = Integer.parseInt(line[i]);
		}
		return numArray;
	}
}