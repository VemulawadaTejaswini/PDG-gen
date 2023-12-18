import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] W = new int[N];
        int total = 0;
        for(int n=0; n<N; n++){
            W[n]=sc.nextInt();
            total += W[n];
        }
        int current = 0;
        int ans = 1000000;
        for(int n=0; n<N; n++){
            current += W[n];
            ans = Math.min(ans, Math.abs(current-(total-current)));
        }
        System.out.println(ans);
    }
}