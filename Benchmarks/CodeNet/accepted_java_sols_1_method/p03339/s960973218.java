import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		// W,Eのカウント。配列は何？
        int countW = 0;
        int arrW[] = new int[n];
        int countE = 0;
        int arrE[] = new int[n];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'W') {
                countW++;
            } else {
                countE++;
            }
            arrW[i] = countW;
            arrE[i] = countE;
        }
        // 与えられた文字列について、W、Eの文字数をそれぞれカウント。
        // さらに各配列に「その位置でのW(E)の要素の数」を突っ込む。

        // こうすると、
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                min = arrE[n - 1] - arrE[i];
            } else {
                int tmp = arrW[i - 1] + (arrE[n - 1] - arrE[i]);
                if (min > tmp) {
                    min = tmp;
                }
            }
        }
        System.out.println(min);
	}
}
