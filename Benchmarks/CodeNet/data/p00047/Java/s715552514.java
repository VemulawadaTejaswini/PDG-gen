import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String t;
		String[] d = new String[4];
		int[] a = new int[4], b = new int[4];
		int ht, bl;
		while ((t = bf.readLine()) != null) {
			ht = bl = 0;
			d = t.split(" ");
			for (int i = 0; i < 4; i++)
				a[i] = Integer.parseInt(d[i]);
			d = bf.readLine().split(" ");
			for (int i = 0; i < 4; i++)
				b[i] = Integer.parseInt(d[i]);
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					if (a[i] == b[j]) {
						if (i == j) {
							ht++;
						} else {
							bl++;
						}
					}
			System.out.println(ht + " " + bl);
		}
	}
}