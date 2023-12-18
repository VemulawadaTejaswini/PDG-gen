import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = 0;
        int[] ans = new int[2];
        while(x < n){
            ans[0] += b;
            x += a;
        }
        x = 0;
        while(x < n){
            ans[1] += d;
            x += c;
        }
        System.out.println(Math.min(ans[0], ans[1]));
    }
}

