import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt();
        int a[] = new int[n + 1];
        int cnt = 0;

        
        // aに入力値を入れる
        for(int ai = 1; ai <= n; ai++) {
            a[ai] = sn.nextInt();
        }
        
        for(int ai = 1; ai <= n; ai++) {
            // マスの番号は奇数
            if(ai % 2 == 1) {
                // マスに書かれた整数は奇数
                if(a[ai] % 2 == 1) {
                    cnt++;
                }
            }
        }
        
        System.out.print(cnt);
        
    }
}
