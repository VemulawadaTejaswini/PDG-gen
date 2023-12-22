// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        int cnt = 0;
        while (cnt < k) {
            if (0 < a) {
                ans++;
                cnt++;
                a--;
                continue;
            }
            if (0 < b) {
                cnt++;
                b--;
                continue;
            }
            if (0 < c) {
                cnt++;
                ans--;
                continue;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}