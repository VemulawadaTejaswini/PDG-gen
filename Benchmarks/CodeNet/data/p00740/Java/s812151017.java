import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String str = br.readLine();
				String s[] = str.split(" ");
				int n = Integer.parseInt(s[0]);
				int p = Integer.parseInt(s[1]);
				if (n == 0 && p == 0)
					break;
				int parsonP[] = new int[n];
				boolean notHave[] = new boolean[n];
				int count = 0;
				int newParson = 0;
				while (true) {
					for (int i = 0; i < n; i++) {
						if (p == 0) {
							p += parsonP[i];
							parsonP[i] = 0;
							notHave[i] = true;
						} else {
							parsonP[i] += 1;
							p--;
							if (parsonP[i] != 0)
								notHave[i] = false;
						}
					}
					for (int i = 0; i < n; i++) {
						if (!notHave[i]) {
							count++;
							newParson = i;
						}
					}
					if (count == 1 && p == 0)
						break;
					count = 0;
				}
				System.out.println(newParson);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
