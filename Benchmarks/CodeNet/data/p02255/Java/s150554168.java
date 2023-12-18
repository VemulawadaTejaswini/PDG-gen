import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

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
			
			output(array);
			
			int work,loc;
			for(int i=1; i<n; i++) {
				work = array[i];
				loc = i-1;
				while(loc >= 0 && array[loc] > work) {
					array[loc+1] = array[loc];
					loc--;
				}
				array[loc+1] = work;
				
				output(array);
			}
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

