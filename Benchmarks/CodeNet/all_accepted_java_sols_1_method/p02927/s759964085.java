import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= d; j++) {
                // 2桁以上の場合のみ
                if (j >= 10) {
                    int d1 = Character.getNumericValue(Integer.toString(j).charAt(0));
                    int d10 = Character.getNumericValue(Integer.toString(j).charAt(1));
                    if (d1 >= 2 && d10 >= 2 && d1 * d10 == i) {
                            cnt++;
                        }
                }
            }
        }
        System.out.println(cnt);
    }
}