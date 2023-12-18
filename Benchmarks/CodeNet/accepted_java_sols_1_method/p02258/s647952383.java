

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int priceRange = Integer.valueOf(in.readLine()); // n
		int minv = Integer.valueOf(in.readLine()); // 最小値
	    int tmp = 0; // 退避用
	    int maxv = 0; // 最大利益（価格の差）
		for (int i = 1; i <= priceRange -1 ; i++) {

			tmp = Integer.valueOf(in.readLine());
			if (i == 1) { // 初回を、最大利益の初期値とする
			maxv = tmp -minv;
			}
			if (maxv < (tmp -minv)) { // 最大利益の更新
				maxv = tmp -minv;
			}
			if (minv > tmp) { // 最小値の更新
				minv = tmp;
			}
		}
        System.out.println(maxv);
	}

}

