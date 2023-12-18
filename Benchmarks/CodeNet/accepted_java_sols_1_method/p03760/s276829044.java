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
        String x = sc.next();
        String y = sc.next();
        int k = 0;
        int i = 0;
        String ans = "";
        while(true){
            if(k%2==0){
                if(x.length()<=i)break;
                ans+=x.charAt(i);
            }else{
                if(y.length()<=i)break;
                ans+=y.charAt(i);
                i++;
            }
            k++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
