import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int s[] = new int[n + 1];
			for (int i = 0; i < n; i++) {
				s[i] = Integer.parseInt(str[i]);
			}
			int q = Integer.parseInt(br.readLine());
			str = br.readLine().split(" ");
			int cnt = 0;
			for (int i = 0; i < q; i++) {
				int key = Integer.parseInt(str[i]);
				if (linearSearch(s, key) != -1) {
					cnt++;
				}
			}
			System.out.println(cnt);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static int linearSearch(int[] s, int key) {

		s[s.length - 1] = key;
		int i = 0;
		while (s[i] != key) {
			i++;
		}
		if (i == s.length - 1) {
			return -1;
		}
		return i;

	}

}

