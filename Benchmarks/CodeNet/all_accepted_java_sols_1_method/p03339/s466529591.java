import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = sc.next();

            // リーダーが一番左の場合
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == 'E') {
                    ans++;
                }
            }
            int prev = ans;
//            System.out.println("prev: " + prev);

            // リーダーが左から2番目〜一番右の場合
            // リーダーが自分の左隣だったときの値(prev)より値を算出する
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == 'W') {
                    prev++;
                }
                if (s.charAt(i) == 'E') {
                    prev--;
                }
                // update ans
                if (prev < ans) {
                    ans = prev;
                }
//                System.out.println("prev: " + prev);
            }

//            System.out.println("---");
            System.out.println(ans);
        }
    }

}
