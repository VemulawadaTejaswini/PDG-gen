// 問題文ちゃんと読んで！！！＞＜
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long y = sc.nextLong();

        long a = -1;
        long b = -1;
        long c = -1;

        label: for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                long tmp = (y - i*10000 - j*5000) / 1000;

                if (tmp < 0)
                    break;
                
                if (i+j+tmp == n) {
                    a = i; b = j; c = tmp;
                }
            }
        }

        System.out.println(a + " " + b + " " + c);
    }
}
