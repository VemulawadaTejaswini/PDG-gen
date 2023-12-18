import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			String[] strArr = br.readLine().split("\\s");
			int[] intArr = new int[N];
			for (int i = 0; i < N; i++) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}
			
			int tmp = 0;
			int j = 0;
			for (int i = 0; i < N ; i++) {
				for (int k = 0; k < N; k++) {
					System.out.print(intArr[k]);
					if (k != N-1) {
						System.out.print(" ");
					}
				}
				System.out.println();
				if (i == N -1) {
					break;
				}
				tmp = intArr[i+1];
				j = i;
				while (j >= 0 && intArr[j] > tmp) {
					intArr[j+1] = intArr[j];
					j--;
				}
				intArr[j+1] = tmp;
			}
			
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
	}

}

