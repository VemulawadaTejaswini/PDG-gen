
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int pointOfTaro = 0;
		int pointOfHanako = 0;

		for (int i = 0; i < count; i++) {
			String[] strs = br.readLine().split(" ");
			if (0 < strs[0].compareTo(strs[1])) {
				pointOfTaro = pointOfTaro + 3;
			} else if (strs[0].compareTo(strs[1]) < 0) {
				pointOfHanako = pointOfHanako + 3;
			} else {
				pointOfTaro++;
				pointOfHanako++;
			}
		}
		System.out.println(pointOfTaro + " " + pointOfHanako);
	}
}