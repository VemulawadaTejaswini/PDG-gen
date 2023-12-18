import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //置き換え回数カウント用変数の宣言
        int count = 0;
        //文字列の取得
        String strS= sc.next();
        String strT = sc.next();
        
        for(int i=0; i<strS.length(); ++i){
            //SとTの各文字が一致しないとき、置き換えに必要な回数をカウントする
            if(strS.charAt(i) != strT.charAt(i)){
                ++count;
            }
        }
        System.out.println(count);
    }
}