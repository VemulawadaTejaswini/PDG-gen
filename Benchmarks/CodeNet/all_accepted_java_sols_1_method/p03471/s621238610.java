import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        int count10000 = -1;
        int count5000 = -1;
        int count1000 = -1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                int tmpCount10000yen = i*10000;// 10000: i枚
                int tmpCount5000yen = j*5000;// 5000: j枚数
                int tmpCount1000yen = 0;// 1000: n-i-j枚数
                if ((n-i-j) > 0) {
                    tmpCount1000yen = (n-i-j)*1000;// 1000: n-i-j枚数
                }

                int tmpAns = tmpCount10000yen + tmpCount5000yen + tmpCount1000yen;
                if (y == tmpAns) {
                    count10000 = i;
                    count5000 = j;
                    count1000 = n-i-j;
                    break;
                }
            }
        }

        System.out.println(count10000 + " " + count5000 + " " + count1000);
    }
}
