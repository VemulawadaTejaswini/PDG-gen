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
        BigInteger x = new BigInteger(sc.next());
        BigInteger y = new BigInteger(sc.next());
        if(x.compareTo(y)>0){
            System.out.println("GREATER");
        }else if(x.compareTo(y)<0){
            System.out.println("LESS");
        }else{
            System.out.println("EQUAL");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
