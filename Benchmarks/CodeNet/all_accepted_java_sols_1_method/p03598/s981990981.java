import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] x = new int [n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            ans += 2*Math.min( Math.abs(0-x[i]), Math.abs(k-x[i]) );
        }
        System.out.println(ans);
    }
}