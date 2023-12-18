import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void countingSort(int[] a, int[] b, int k, int n){
		int[] c = new int[k + 1];

		for(int i = 0; i < n; i++) {
			c[a[i]]++;
		}

		for(int i = 1; i < k + 1; i++) {
			c[i] = c[i] + c[i - 1];
		}

		for(int i = n - 1; i >= 0; i--) {
			b[c[a[i]] - 1] = a[i];
			c[a[i]]--;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ElementCount = Integer.parseInt(br.readLine());

		String[] c = br.readLine().split(" ");

		int[] cInt = new int[ElementCount];

		int cIntMaxNum = 0;
		for(int i = 0; i < ElementCount; i++) {
			cInt[i] = Integer.parseInt(c[i]);
			cIntMaxNum = Math.max(cIntMaxNum, cInt[i]);
		}

		int[] cIntSort = new int[ElementCount];

		countingSort(cInt, cIntSort, cIntMaxNum, ElementCount);

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < cIntSort.length; i++) {
			sb.append(cIntSort[i]);
			if(i == cIntSort.length - 1){
				break;
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}