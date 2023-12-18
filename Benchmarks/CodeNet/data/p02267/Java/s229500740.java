import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bReader.readLine());

		int[] S = new int[n];
		String[] strArray = bReader.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			S[i] = Integer.parseInt(strArray[i]);
		}
		int q = Integer.parseInt(bReader.readLine());

		int[] T = new int[q];
		String[] strArray2 = bReader.readLine().split(" ");

		for (int i = 0; i < q; i++) {
			T[i] = Integer.parseInt(strArray2[i]);
		}
		int count = 0;
		for (int i = 0; i < T.length; i++) {
			if (linearSeach(S, T[i]) != -1) {
				count++;
			}
		}
		System.out.println(count);

	}

	static int linearSeach(int[] array, int key) {
		int result = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key){
				return i;
			}
		}
		return result;
	}
}
