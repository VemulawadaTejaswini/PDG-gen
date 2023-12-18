import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long[] map = new long[100002];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                if(m*i+n*j-i*j*2 == k){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
