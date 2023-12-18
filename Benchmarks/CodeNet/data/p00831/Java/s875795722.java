import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	HashSet<String> gHs;

	void eM(String s, HashSet<String> l) {
		int n = s.length();

		String pre[] = new String[n];
		String post[] = new String[n];

		for (int i = 0; i < n; i++) {
			pre[i] = s.substring(0, i);
		}

		for (int i = 0; i < n; i++) {
			post[i] = s.substring(i);
		}

		for (int i = 0; i < n - 1; i++) {
			l.add(pre[i] + post[i + 1]); // del
			// gHs.add(pre[i] + post[i + 1]);
			for (char c = 'a'; c <= 'z'; c++) {
				l.add(pre[i] + c + post[i + 1]); // rep
				// gHs.add(pre[i] +c+ post[i + 1]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (char c = 'a'; c <= 'z'; c++) {
				l.add(pre[i] + c + post[i]); // ins
				// gHs.add(pre[i]+c + post[i ]);
			}
		}
		for (char c = 'a'; c <= 'z'; c++) {
			l.add(s + c);
			// gHs.add(s+c);
		}

		char[] chmap = s.toCharArray();

		for (int i = 0; i < n - 1; i++) {
			int j = i + 1;
			{
				char sw = chmap[i];
				chmap[i] = chmap[j];
				chmap[j] = sw;
				l.add(new String(chmap)); // exc
				// gHs.add(new String(chmap));
				sw = chmap[i];
				chmap[i] = chmap[j];
				chmap[j] = sw;
			}
		}
	}

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int d = sc.nextInt();
			gHs = new HashSet<String>();
			String[] name = new String[n];

			for (int i = 0; i < n; i++) {
				name[i] = sc.next();
			}

			Arrays.sort(name);

			// System.out.println(Arrays.toString(name));
			int cnt = 0;

			HashSet<String>[] llst = new HashSet[n];
			for (int i = 0; i < n; i++) {
				llst[i] = new HashSet<String>();
				eM(name[i], llst[i]);
			}

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (name[i].equals(name[j])) {
						System.out.println(name[i] + "," + name[j]);
						cnt++;
					} else if (d > 0) {
						boolean check = llst[i].contains(name[j]);
						if (check) {
							System.out.println(name[i] + "," + name[j]);
							cnt++;
						} else if (d > 1) {
							boolean check2 = false;
							for (String str : llst[i]) {

								check2 = llst[j].contains(str);
								if (check2) {
									break;
								}
							}
							if (check2) {
								System.out.println(name[i] + "," + name[j]);
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);

		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}