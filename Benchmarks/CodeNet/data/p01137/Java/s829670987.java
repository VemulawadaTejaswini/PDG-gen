import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int x = 0;
		int y = 0;
		int z = 0;
		int[] m = new int[1000];
		int temp_m;
		int count;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (count = 0; count >= 0; count++) {
			String str = br.readLine();
			int e = Integer.parseInt(str);
			if (e == 0) {
				break;
			}

			m[count] = e;

			for (int tempz = 0; tempz * tempz * tempz <= e; tempz++) {
				z = tempz;
			}

			for (int i = 0; z > 0; i++) {
				for (int tempy = 0; tempy * tempy <= e - z * z * z; tempy++) {
					y = tempy;
				}
				x = e - z * z * z - y * y;
				// m[i] = x+y+z;
				temp_m = x + y + z;
				if (temp_m < m[count]) {
					m[count] = temp_m;
				}

				z--;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(m[i]);
		}
	}

}

