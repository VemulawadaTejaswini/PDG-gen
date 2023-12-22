import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] ans = new int[n+1];
        ans[0] = 1;
        for(int i = 0; i <= n; i++){
            if(i - r >= 0){
                ans[i] += ans[i-r];
            }
        }
        for(int i = 0; i <=n ; i++){
            if(i - g >= 0){
                ans[i] += ans[i-g];
            }
        }
        for(int i = 0; i <=n ; i++){
            if(i - b >= 0){
                ans[i] += ans[i-b];
            }
        }
        System.out.println(ans[n]);
    }
}
