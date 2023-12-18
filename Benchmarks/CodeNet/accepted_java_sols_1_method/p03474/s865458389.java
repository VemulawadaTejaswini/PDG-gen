import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] c = sc.next().toCharArray();
        boolean ok = c.length == a + b + 1;
        for(int i=0;i<c.length;i++){
            if(i==a){
                if(c[i]!='-'){
                    ok=false;
                }
            }else{
                if(!Character.isDigit(c[i])){
                    ok=false;
                }
            }
        }
        System.out.println(ok?"Yes":"No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
