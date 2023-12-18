import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main{
    static long ans = 0;
    static int mod = 998244353;
    public static void main(String[] args) {
        ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        for(int i = 0;i < k;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l;j <= r;j++){
                queue.add(j);
            }
        }
        int[]arr = new int[queue.size()];
        for(int i = 0;i < arr.length;i++){
            arr[i] = queue.poll();
        }
        dfs(arr,1,n);
        System.out.println(ans);
    }
    private static void dfs(int[]arr,int cur,int n){
        if(cur == n){
            ans++;
            ans %= mod;
            return;
        }
        if(cur > n)
            return;
        for(int i = 0;i < arr.length;i++){
            int next = cur + arr[i];
            dfs(arr,next,n);
        }
    }
}
