import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int k = 1;
        for(int i=0;i<S.length();i++){
            int c = S.charAt(i)-'a'+1;
            if( (k & (1<<c)) != 0){

                System.out.println("no");
                return;
            }
            k |= (1<<c);
        }
        
        System.out.println("yes");
    }

    public static void main(String[] args) {
        new Main();
    }
}
