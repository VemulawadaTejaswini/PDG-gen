import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] array = new int[n];
			String input = br.readLine();
			String[] s = input.split("\\s");
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(s[i]);
			}
			System.out.println(bubbleSort(array));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// バブルソート
	public static int bubbleSort(int[] array) {
		int cnt = 0;// 交換回数
		boolean flg = true;
		for (int i = 0; flg; i++) { // iは未ソート部分列の先頭インデックス
			flg = false;
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
					flg = true;
					cnt++;
				}
			}

		}
		// 表示
		String str = Arrays.toString(array);
		System.out.println(str.replace("[", "").replace("]", "").replace(",", ""));
		return cnt;
	}

}
