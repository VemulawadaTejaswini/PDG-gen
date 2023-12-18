import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int[] c = new int[] { 0, 0, 0, 0 };
		while ((line = bf.readLine()) != null) {
			String[] s = line.split(",");
			if (s.length != 2)
				break;
			if (s[1].equals("A")) {
				c[0]++;
			} else if (s[1].equals("B")) {
				c[1]++;
			} else if (s[1].equals("O")) {
				c[3]++;
			} else {
				c[2]++;
			}
		}
		for(int i=0;i<4;i++)System.out.println(c[i]);
	}
}