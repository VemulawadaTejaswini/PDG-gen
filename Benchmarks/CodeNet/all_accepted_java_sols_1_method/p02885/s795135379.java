import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //窓の長さ・カーテンの長さを取得する
        Integer windowLength = sc.nextInt();
        Integer curtainLength = sc.nextInt();
        
        //窓のうちカーテンで隠されていない横部分の長さを定義する
        Integer resultLength = windowLength - (curtainLength * 2);
        
        //カーテンが窓よりも長い場合は0とする
        if(resultLength < 0) {
            resultLength = 0;
        }
        
        //出力する
        System.out.println(resultLength);
    }
}