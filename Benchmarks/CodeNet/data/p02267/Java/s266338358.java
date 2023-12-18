import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		makeNumsSet();
	}

	private static void makeNumsSet() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String S = br.readLine();
			String[] Sset = S.split(" ");
			int q = Integer.parseInt(br.readLine());
			String T = br.readLine();
			String[] Tset = T.split(" ");

			int count = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < q; j++) {
					if (Sset[i].equals(Tset[j])) {
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			System.out.print("Error occurs");
		}

	}

}