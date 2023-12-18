import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        List<List<Integer>> sl = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++){
            sl.add(new ArrayList<Integer>());
        }
        int[] p = new int[m];
        for(int i = 0; i < m; i++){
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                sl.get(sc.nextInt()-1).add(i);
            }
        }
        for(int i = 0; i < m; i++){
            p[i] = sc.nextInt();
        }
        int loops = (int)Math.pow(2,n);
        for(int i = 0; i < loops; i++){
            int[] tp = new int[m]; 
            for(int j = 0; j < n; j++){
                if(((i >> j) % 2) == 1){
                    List<Integer> tmp = sl.get(j);
                    for(int v:tmp){
                        tp[v]++;
                    }
                }
            }
            boolean bool = true;
            for(int j = 0; j < m; j++){
                if(tp[j]%2 != p[j]){
                    bool = false;
                    break;
                }
            }
            if(bool){
                ans++;
            }
        }
        System.out.println(ans);
    }
}