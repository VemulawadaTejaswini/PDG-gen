import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        BigDecimal[] array = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextBigDecimal();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean flg = true;
                BigDecimal tmp1 = array[i];
                BigDecimal tmp2 = array[j];
                BigDecimal tmp = tmp1.multiply(tmp2);
                String tmpstr = String.valueOf(tmp);
                if (tmpstr.contains("E")) {
                    flg = false;
                } else if (!tmpstr.contains(".")) {
                    cnt++;
                    flg = false;
                }
                if (flg) {
                    int indexOfDecimal = tmpstr.indexOf(".");
                    String ans = tmpstr.substring(indexOfDecimal);
                    String aftans = ans.replaceAll("0", "");
                    if (".".equals(aftans)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
