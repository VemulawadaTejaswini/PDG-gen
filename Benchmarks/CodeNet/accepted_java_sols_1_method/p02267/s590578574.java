import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(
						new InputStreamReader(System.in) );

		int n = Integer.parseInt( br.readLine() );
		String[] temp;

		int[] S = new int[n];
		temp = br.readLine().split(" ");
		for (int i=0; i < n; i++) {
			S[i] = Integer.parseInt(temp[i]);
		}

		int q = Integer.parseInt( br.readLine() );

		int[] T = new int[q];
		temp = br.readLine().split(" ");
		for (int i=0; i < q; i++) {
			T[i] = Integer.parseInt(temp[i]);
		}

		int count = 0;
		for (int i=0; i < T.length; i++) {
			for (int j=0; j < S.length; j++) {
				if (T[i] == S[j]) {
					count++;
					break;
				}
			}
		}

		System.out.println(count);
	}

}