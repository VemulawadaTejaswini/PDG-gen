import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int N, Q;
			N = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			Q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int[] years = new int[51];
			String[] names = new String[N + 1];

			int yearPrev = 1;
			int idxPrev = 0;
			names[idxPrev] = "kogakubu10gokan";

			for (int i = 0; i < N; i++) {
				line = br.readLine();
				int yearNext = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				names[idxPrev + 1] = line.substring(line.indexOf(' ') + 1);
				for (int j = yearPrev; j < yearNext; j++) {
					years[j] = idxPrev;
				}
				yearPrev = yearNext;
				idxPrev++;
			}
			for (int j = yearPrev; j < 51; j++) {
				years[j] = idxPrev;
			}
			System.out.println(names[years[Q]]);
		}
	}
}