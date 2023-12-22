import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // 宣言
        Scanner sc = new Scanner(System.in);
        // 入力値取得
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;
        
        int ans = a - b;
        
        // ans < 0 の場合0を代入
        if(ans < 0){
            ans = 0;
        }
        System.out.println(ans);
    }
}
