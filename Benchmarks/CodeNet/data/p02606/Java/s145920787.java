import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // 整数の入力
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        
        // 出力
        int count = 0;
        for (int i = l; i <= r; i++){
            if(i % d == 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}