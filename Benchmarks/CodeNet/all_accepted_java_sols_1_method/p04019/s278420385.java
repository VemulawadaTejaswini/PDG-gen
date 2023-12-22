import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] str = line.split("");
		int n = 0, w = 0, s = 0, e = 0;
		for (int i = 0; i < str.length; i++) {
			if ((str[i]).equals("N")) {
				n++;
			} else if ((str[i]).equals("W")) {
				w++;
			} else if ((str[i]).equals("S")) {
				s++;
			} else if ((str[i]).equals("E")) {
				e++;
			}
		}
		if (((n >= 1) && (s == 0)) || ((n == 0) && (s >= 1)) || ((w >= 1) && (e == 0)) || ((w == 0) && (e >= 1))) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
