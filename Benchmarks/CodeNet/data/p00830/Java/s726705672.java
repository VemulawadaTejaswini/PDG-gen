import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				sc.close();
				break;
			}

			int M = sc.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < N; i++) {
				String path[] = sc.next().split("/");
				String tmp = "";
				for (int j = 0; j < path.length; j++) {
					tmp += path[j];
					if (j < path.length - 1) {
						tmp += "/";
					}
					list.add(tmp);
				}
			}

			for (int i = 0; i < M; i++) {
				boolean found = true;
				String[] input = new String[2];
				for (int k = 0; k < 2; k++) {
					boolean suffix = false;
					String a = sc.next();
					if (a.charAt(a.length() - 1) == '/') {
						a += "index.html";
						suffix = true;
					}
					String path[] = a.split("/");
					String tmp = "";
					for (int j = 0; j < path.length; j++) {
						if (path[j].equals(".")) {
							tmp = tmp.replaceAll("/$", "");
						} else if (path[j].equals("..")) {
							if (tmp.equals("/")) {
								found = false;
							} else {
								tmp = tmp.replaceAll("/[a-zA-Z\\.]*/$", "");
							}
						} else {
							tmp += path[j];
						}
						if (j < path.length - 1) {
							tmp += "/";
						} else if (!list.contains(tmp) && !suffix) {
							// 末尾の時
							// フォルダなら
							tmp += "/index.html";
						}
						if (!list.contains(tmp)) {
							found = false;
						}
					}
					if (found) {
						input[k] = tmp;
					}
				}
				if (found) {
					if (input[0].equals(input[1])) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else {
					System.out.println("not found");
				}
			}

		}
	}
}