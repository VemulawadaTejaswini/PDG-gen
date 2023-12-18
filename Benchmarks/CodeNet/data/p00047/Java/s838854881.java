import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String t = "";
		boolean[] c = new boolean[3];
		for (int i = 0; i < 3; i++)
			c[i] = false;
		c[0] = true;
		while ((t = bf.readLine()) != null) {
			char[] ca = t.toCharArray();
			if (ca.length != 3)break;
			int p0 = (int) ca[0] - 'A';
			int p1 = (int) ca[2] - 'A';
			c[p0] ^= c[p1];
			c[p1] ^= c[p0];
			c[p0] ^= c[p1];
		}
		for (int i = 0; i < 3; i++)
			if (c[i]) {
				System.out.println((char) ('A' + i));
				break;
			}
	}
}