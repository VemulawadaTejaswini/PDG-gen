import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 人数
        int n;
        // お菓子の種類
        int k;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        k = sc.nextInt();
        
        boolean[] has = new boolean[n + 1];
        
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            
            for (int j = 0; j < d; j++) {
                has[sc.nextInt()] = true;
            }
        }
        
        int ans = 0;
        for (int i = 1; i < has.length; i++) {
            if (!has[i]) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}