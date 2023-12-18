
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
        String s = sc.next();
        String t = sc.next();
        int ans = 0;
        for(int i=0;i<3;i++){
            if(s.charAt(i)==t.charAt(i))ans++;
        }
        System.out.println(ans);
    }
}