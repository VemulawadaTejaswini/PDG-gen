import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String input_str[] = br.readLine().split("\\s+");
			int[] array = new int[n];
			for(int i=0; i < n; i++) {
				array[i] = Integer.parseInt(input_str[i]);
			}
			int work, sw = 0;
			for(int i=0; i<n-1; i++) {
				for(int j=n-1; j>i; j--) {
					if(array[j-1] > array[j]) {
						work = array[j-1];
						array[j-1] = array[j];
						array[j] = work;
						sw++;
					}
				}
			}
			output(array);
			System.out.println(sw);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	private static void output(int[] array) {
		System.out.printf("%d", array[0]);
		for (int i=1; i<array.length; i++) {
			System.out.printf(" %d", array[i]);
		}
		System.out.printf("\n");
	}

}

