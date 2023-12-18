import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        int[] dif = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        int[] ten = new int[n];
        for(int i = 0; i < n; i++){
            ten[i] = t*1000 - h[i]*6;
        }
        for(int i = 0; i < n; i++){
            dif[i] = Math.abs(a*1000 - ten[i]);
        }
        int min = dif[0];
        for(int i = 1; i < n; i++){
            min = Math.min(min, dif[i]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(min == dif[i]){
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}
