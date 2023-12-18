import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 宣言
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        boolean check = false;
        
        // 九九全パターンから探索
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                ans = i * j;
                // 処理
                if(ans == n){
                    check = true;
                    break;
                }
            }
        }
        
        // 判定
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");            
        }
    }
}
