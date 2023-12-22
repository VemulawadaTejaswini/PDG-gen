import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static String BLOOD_A_ = "A";
	static String BLOOD_B_ = "B";
	static String BLOOD_AB = "AB";
	static String BLOOD_O_ = "O";
	static String DELIM = ",";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] sum = new int[4];
		StringTokenizer st;
		String blood;

		while ((line = br.readLine()) != null) {

			st = new StringTokenizer(line, DELIM);
			st.nextToken();
			blood = st.nextToken();

			if (blood.equals(BLOOD_A_)) {
				sum[0]++;
			} else if (blood.equals(BLOOD_B_)) {
				sum[1]++;
			} else if (blood.equals(BLOOD_AB)) {
				sum[2]++;
			} else if (blood.equals(BLOOD_O_)) {
				sum[3]++;
			}
		}
		for (int i : sum) {
			System.out.println(i);
		}
	}
}