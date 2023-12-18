import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String str = br.readLine();
				String ss[] = str.split(" ");
				int x = Integer.parseInt(ss[0]);
				int y = Integer.parseInt(ss[1]);
				int sx = Integer.parseInt(ss[2]);
				if (x == 0 && y == 0 && sx == 0)
					break;
				int s = (sx * 100) / (100 + x);
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = 1; i <= s / 2; i++) {
					int a = ((s - i) * (100 + y)) / 100;
					int b = (i * (100 + y)) / 100;
					list.add(a + b);
				}
				System.out.println(Collections.max(list));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
