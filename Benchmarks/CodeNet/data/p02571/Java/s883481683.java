import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String target;
        int len;
        int ans = -1;

        for_LB:
        for(int j = 0; j <= 1; j++) {
            for (int i = 0; i < T.length(); i++) {          //Tの文字列を後ろから1文字ずつ減らす
                len = T.length() - i;                       //Tの長さ情報
                target = T.substring(0, len);               //len分の文字列をtargetに代入
                if (S.indexOf(target) != -1) {              //Sにtargetがあるか探す
                    ans = i;                                //見つけたら減らした分をansに代入する
                    break for_LB;
                }
            }
            for (int i = 0; i < T.length(); i++) {            //Tの文字列を前から1文字ずつ減らす
                target =  T.substring(i, T.length());       //iの位置から最後までの文字列をtargetに代入
                if (S.indexOf(target) != -1) {              //Sにtargetがあるか探す
                    ans = i;                                //見つけたら減らした分をansに代入する
                    break for_LB;
                }
                else {
                    ans = T.length();
                }
            }
        }
        System.out.println(ans);
    }
}
