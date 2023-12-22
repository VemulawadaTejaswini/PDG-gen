import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC149D - Prediction and Restrictionx

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // じゃんけん回数
        int k = sc.nextInt();   // この回目前と同じ手禁止
        int r = sc.nextInt();   // グーの点数
        int s = sc.nextInt();   // チョキの点数
        int p = sc.nextInt();   // パーの点数
        String t = sc.next();   // CPの手

        char[] ct = t.toCharArray();

        int ten = 0;

        for (int i = 0; i < n; i++) {
            if (i < k) {
                if (ct[i] == 'r') { // パーで勝つ
                    ten += p;
                } else if (ct[i] == 's') {  // グーで勝つ
                    ten += r;
                } else {    // チョキで勝つ
                    ten += s;
                }
            } else {
                if (ct[i - k] != ct[i]) {
                    if (ct[i] == 'r') { // パーで勝つ
                        ten += p;
                    } else if (ct[i] == 's') {  // グーで勝つ
                        ten += r;
                    } else {    // チョキで勝つ
                        ten += s;
                    }
                } else {
                    ct[i] = 'z';
                }
            }
        }

        System.out.println(ten);
    }
}
