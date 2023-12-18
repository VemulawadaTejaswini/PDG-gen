
import java.io.*;// 从这行开始复制，这是第一行
import java.util.*;

public class Main {

    private static void fun(int h1, int m1, int h2, int m2, int k) {
        int mm1 = h1 * 60 + m1;
        int mm2 = h2 * 60 + m2;

        System.out.println(mm2-mm1-k);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        fun(h1, m1, h2, m2, k);
    }
}