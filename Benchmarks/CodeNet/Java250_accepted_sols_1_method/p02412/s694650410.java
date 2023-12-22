import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			List<Integer> ret = new ArrayList<Integer>();
			int n, x;
			do {
				String[] inputList = br.readLine().split(" ");
				n = Integer.parseInt(inputList[0]);
				x = Integer.parseInt(inputList[1]);
				if (n == 0 && x == 0) {
					break;
				} else {
					if (x < 6) {
						ret.add(0);
					} else {
						List<int[]> hoge = new ArrayList<int[]>();
						int a, b, c;
						for (a = 1; a <= n; a++) {
							for (b = 1; b <= n; b++) {
								for (c = 1; c <= n; c++) {
									if (!(a == b || b == c || a == c) && a + b + c == x) {
										boolean flg = true;
										for (int[] list : hoge) {
											if ((list[0] == a || list[0] == b || list[0] == c)
													&& (list[1] == a || list[1] == b || list[1] == c)
													&& (list[2] == a || list[2] == b || list[2] == c)) {
												flg = false;
												break;
											}
										}
										if (flg) {
											int[] tmp = new int[3];
											tmp[0] = a;
											tmp[1] = b;
											tmp[2] = c;
											hoge.add(tmp);
											break;
										}
									}
								}
							}
						}
						ret.add(hoge.size());
					}
				}
			} while (true);
			for (int num : ret) {
				System.out.println(num);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}