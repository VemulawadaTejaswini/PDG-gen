import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(A);

		size = Integer.parseInt(br.readLine());
		input = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (isCreateNum(A, 0, 0, Integer.parseInt(input[i]))) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		System.out.print(sb);
	}

	static boolean isCreateNum(int[] srcArray, int srcIndex, int sum, int num) {
		if (srcIndex > srcArray.length - 1) return false;
		if (srcArray[srcIndex] + sum == num) return true;
		if (srcArray[srcIndex] + sum > num) {
			return false;
		} else if (isCreateNum(srcArray, srcIndex + 1, sum, num)) {
			return true;
		} else if (isCreateNum(srcArray, srcIndex + 1, sum + srcArray[srcIndex], num)) {
			return true;
		}
		return false;
	}
}