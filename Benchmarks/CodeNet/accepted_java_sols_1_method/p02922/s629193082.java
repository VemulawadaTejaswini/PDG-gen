
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;
        int cnt = 1;
        while(cnt<B){
            cnt-=1;
            cnt+=A;
            ans++;
        }
        
        System.out.println(ans);
    }
}