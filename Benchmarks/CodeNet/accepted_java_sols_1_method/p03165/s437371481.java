import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int lcm[][] = new int[s.length() + 1][t.length() + 1];
        int move[][] = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i < s.length() + 1; i++) {
            char ss = s.charAt(i - 1);
            for (int j = 1; j < t.length() + 1; j++) {
                char tt = t.charAt(j - 1);
                if (ss == tt) {

                    lcm[i][j] = lcm[i - 1][j - 1] + 1;
                    // 左上
                    move[i][j] = 3;
                } else if (lcm[i - 1][j] > lcm[i][j - 1]) {
                    lcm[i][j] = lcm[i - 1][j];
                    // 上
                    move[i][j] = 2;
                } else {
                    lcm[i][j] = lcm[i][j - 1];
                    // 左
                    move[i][j] = 1;
                }
            }
        }
        // 経路復元
        String ans = "";
        int spos = s.length();
        int tpos = t.length();
        while (spos >= 0 && tpos >= 0) {
            if (move[spos][tpos] == 3) {
                ans = s.charAt(spos - 1) + ans;
                spos--;
                tpos--;
            } else if (move[spos][tpos] == 2) {
                spos--;
            } else {
                tpos--;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}