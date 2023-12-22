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
        boolean ok  = true;
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            if(num%2==0){
                if(num%3==0||num%5==0){

                }else{
                    ok=false;
                }
            }
        }
        System.out.println(ok?"APPROVED":"DENIED");
    }

    public static void main(String[] args) {
        new Main();
    }
}
