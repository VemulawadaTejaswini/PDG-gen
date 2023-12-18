import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// お札の枚数
        int targetYen = sc.nextInt();

        int count10000Yen = -1;// 10000円の枚数
        int count5000Yen = -1;// 5000円の枚数
        int count1000Yen = -1;// 1000円の枚数

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int tmpCount10000Yen = i;// 10000円の枚数
                int tmpCount5000Yen = j;// 5000円の枚数
                int tmpCount1000Yen = n - (i+j);// 1000円の枚数
                if (tmpCount1000Yen < 0) break;// お札の枚数が多すぎる

                int tmpSum = (10000*tmpCount10000Yen) + (5000*tmpCount5000Yen) + (1000*tmpCount1000Yen);
                if (tmpSum == targetYen) {
                    count1000Yen = tmpCount1000Yen;
                    count5000Yen = tmpCount5000Yen;
                    count10000Yen = tmpCount10000Yen;
                    break;
                }
            }
        }

        System.out.println(count10000Yen + " " + count5000Yen + " " + count1000Yen);
    }
}
