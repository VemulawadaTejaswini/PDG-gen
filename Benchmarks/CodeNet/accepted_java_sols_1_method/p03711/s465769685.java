import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        //配列の要素数に対応する数字を格納
        //グループ0:0
        //グループ1：1,3,5,7,8,10,12
        //グループ2：4,6,9,11
        //グループ3：2
        int a [] = {0 , 1 , 3 , 1 , 2 , 1 , 2 , 1 , 1 , 2 , 1 , 2 , 1};
        
        //同じグループに属するか判定して結果を出力
        if(a[x] == a[y]){
                System.out.println("Yes");
        }else{
                System.out.println("No");
        }
        
    }
}