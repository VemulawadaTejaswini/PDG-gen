import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String s;
        int count = 0;
        int max = 0;

        int sLen = S.length();
        int tLen = T.length();
        for (int i = 0; i <= sLen - tLen; i++) {    //T文字列が入りきるところまでループ
            s = S.substring(i, i + tLen);           //1文字ずつずらして取り出し
            count = 0;
            for (int j = 0; j < tLen; j++) {
                if (s.charAt(j) == T.charAt(j)) {   //取り出した文字列を1文字ずつ比較
                    count++;                        //一致したらcount++;
                }
            }
            if (max < count) {
                max = count;
            }
        }
        System.out.println(tLen - max);
    }
}
