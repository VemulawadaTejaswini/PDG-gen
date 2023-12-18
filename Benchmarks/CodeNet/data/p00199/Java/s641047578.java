import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			char[] ch = new char[n + 2];
			for (int i = 1; i <= n; i++) {
				ch[i] = '#';
			}
			for (int i = 0; i < m; i++) {
				char p = sc.next().charAt(0);
				switch (p) {
				case 'A':
					for (int j = 1; j <= n; j++) {
						if (ch[j] == '#') {
							ch[j] = 'A';
							break;
						}
					}
					break;
				case 'B':
					boolean flag = true;
					for (int j = n; j >= 1; j--) {
						if (ch[j - 1] != 'A' && ch[j + 1] != 'A'
								&& ch[j] == '#') {
							ch[j] = 'B';
							flag = false;
							break;
						}
					}
					if (flag) {
						for (int j = 1; j <= n; j++) {
							if (ch[j] == '#') {
								ch[j] = 'B';
								break;
							}
						}
					}
					break;
				case 'C':
					flag = true;
					for (int j = 1; j <= n; j++) {
						if (ch[j] != '#') {
							flag = false;
							if (ch[j + 1] == '#') {
								ch[j + 1] = 'C';
								break;
							} else if (ch[j - 1] == '#') {
								ch[j - 1] = 'C';
								break;
							}
						}
					}
					if (flag) {
						ch[n / 2 + 1] = 'C';
					}
					break;
				case 'D':
					int num = 0;
					int max = 0;
					int dis[] = new int[n + 1];
					Arrays.fill(dis, INF);
					for (int j = 1; j <= n; j++) {
						for (int k = 1; k <= n; k++) {
							if (ch[k] != '#') {
								dis[j] = Math.min(dis[j], Math.abs(j - k));
							}
						}
					}
					for (int j = 1; j <= n; j++) {
						if (dis[j] > max) {
							max = dis[j];
							num = j;
						}
					}
					ch[num] = 'D';
					break;
				}
			}
			System.out.println(new StringBuilder().append(ch).substring(1,n+1));
		}
	}
}