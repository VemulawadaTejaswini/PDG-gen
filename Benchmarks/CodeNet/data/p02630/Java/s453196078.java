// 提出時に消す


import java.util.Scanner;
import java.util.stream.LongStream;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a[] = LongStream.range(0, n).map(e -> sc.nextLong()).toArray();
        int q = sc.nextInt();
        long b[] = new long[q];
        long c[] = new long[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextLong();
            c[i] = sc.nextLong();
        }

        long s[] = new long[q];

        for (int i = 0; i < q; i++) {
            long bi = b[i];
            long ci = c[i];
            a = LongStream.of(a).map(e -> {
                if (e == bi) {
                    return ci;
                }
                return e;
            }).toArray();
            s[i] = LongStream.of(a).sum();
        }

        for (long ans : s) {
            System.out.println(ans);
        }

        sc.close();
    }
}