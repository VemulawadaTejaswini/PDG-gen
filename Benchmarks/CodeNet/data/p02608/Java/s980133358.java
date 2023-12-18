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
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] sum = new int[N+1];
        // for(int i=1;i<=N;i++){
            for(int x=1;x*x<=N;x++){
                for(int y=1;x*x+y*y<=N;y++){
                    for(int z=1;x*x+y*y+z*z<=N;z++){
                        if(x*x+y*y+z*z+x*y+y*z+z*x<=N){
                            sum[x*x+y*y+z*z+x*y+y*z+z*x]++;
                        }
                    }
                }
            }
        // }
        for(int i=1;i<=N;i++){
            System.out.println(sum[i]);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
