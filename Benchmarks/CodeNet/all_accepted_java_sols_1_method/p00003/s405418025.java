import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = Integer.parseInt(str);
		for (int i = 0; i < count; i++) {
			str = br.readLine();
			String[] datasetstr = str.split(" ", 3);
			int[] datasetint = new int[3];
			for (int j = 0; j <= 2; j++) {

				datasetint[j] = Integer.parseInt(datasetstr[j]);
			}
			for (int k = 0; k <= 1; k++) {
				for (int l = k + 1; l <= 2; l++) {
					if (datasetint[k] < datasetint[l]) {
						int temporary = datasetint[k];
						datasetint[k] = datasetint[l];
						datasetint[l] = temporary;
					}
				}
			}
			int cc = datasetint[0] * datasetint[0];
			int aa = datasetint[1] * datasetint[1];
			int bb = datasetint[2] * datasetint[2];
			Boolean isRight = cc == (aa + bb);
			if (isRight) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}