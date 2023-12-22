import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        sc.close();
        int ans;
        if (P<Q){
            if (Q<R){
                ans = P + Q;
            } else {
                ans = P + R;
            }
        } else {
            if (P<R){
                ans = P + Q;
            } else {
                ans = Q + R;
            }
        }
        System.out.println(ans);
    }
}