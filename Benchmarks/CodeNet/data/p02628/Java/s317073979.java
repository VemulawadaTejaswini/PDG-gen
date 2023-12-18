// 提出時に消す


import java.util.Scanner;
import java.util.stream.IntStream;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int p[] = IntStream.range(0, n).map(e -> sc.nextInt()).sorted().toArray();

        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += p[i];
        }

        System.out.println(ans);

        sc.close();
    }
}