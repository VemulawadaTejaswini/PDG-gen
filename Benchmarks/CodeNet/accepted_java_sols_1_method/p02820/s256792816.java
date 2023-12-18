import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();

        String[] t = sc.next().split("");

        long ans = 0;

        for (int i = 0; i < k; i++) {
            boolean isAiko = false;
            for (int j = i; j < n; j += k) {
                long value = 0;
                switch (t[j]) {
                    case "r":
                        value = p;
                        break;
                    case "s":
                        value = r;
                        break;
                    case "p":
                        value = s;
                        break;
                }

                // なんでも出していいゾーン
                if (j < k) {
                    ans += value;
                }
                // k個前に出した組み合わせのとき
                else if (t[j].equals(t[j - k]) && !isAiko) {
                    // これをアイコにする
                    isAiko = true;
                } else {
                    //　前アイコで違う組み合わせだった
                    if (isAiko) {
                        isAiko = false;
                    }
                    ans += value;
                }
            }
        }

        System.out.println(ans);
    }
}