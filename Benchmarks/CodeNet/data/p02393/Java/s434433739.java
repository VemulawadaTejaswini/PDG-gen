import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] box = new int[3];

		for (int i = 0; i < box.length; i++) {
			String str = br.readLine();
			box[i] = Integer.parseInt(str);

		}
		for (int b = 0; b < box.length - 1; b++) {
			for (int o = b + 1; o < box.length; o++) {
				if (box[b] > box[o]) {
					int tmp = box[b];
					box[b] = box[o];
					box[o] = tmp;
				}
			}
		}
		for (int x = 0; x < box.length; x++) {
			System.out.println(box[0] + "" + box[1] + "" + box[2]);
		}
	}
}