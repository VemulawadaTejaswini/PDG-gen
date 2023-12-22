import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long kouho1 = 1;
        long kouho2 = 1;
        double standard = Math.sqrt(x);

        for (long i = (long)standard; i >= 2; i--) {
            if (x % i == 0) { // 最小の因数を求める
                while (x % i == 0) {
                    x /= i; // 最小の因数で割った数を代入する
                    if (kouho1 * i > standard) {
                        kouho2 *= i;
                    } else {
                        kouho1 *= i;
                    }
                }
            }
        }

        if (x > kouho1 * kouho2) {
            kouho2 *= kouho1;
            kouho1 = x;
        } else if (kouho1 * x >= standard) {
            kouho2 *= x;
        }  else {
            kouho1 *= x;
        }

        System.out.println(Math.max(String.valueOf(kouho1).length(), String.valueOf(kouho2).length()));
    }
}