import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        int[] lis = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }

        lis[0] = 0;
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(h[i - 1] >= h[i]){
                lis[i] = lis[i - 1] + 1;
                ans = Math.max(ans, lis[i]);
            } else{
                lis[i] = 0;
            }
        }

        System.out.println(ans);
        return;
    }
}