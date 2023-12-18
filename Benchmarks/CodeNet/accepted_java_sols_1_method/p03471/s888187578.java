import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            if (10000*i > y) {
                continue;
            }
            for (int j = n-i; j >= 0; j--) {
                if (10000*i + 5000*j > y) {
                    continue;
                }
                int k = n-i-j;
                if (10000*i + 5000*j + 1000*k == y) {
                    // 出力
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        // 出力
        System.out.println("-1 -1 -1");
    }
}
