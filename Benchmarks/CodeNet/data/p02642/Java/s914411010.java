import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        boolean[] dp = new boolean[a[n-1]];
        for (int i=0;i<n;i++)dp[a[i]-1]=true;
        HashSet<Integer> hash = new HashSet<>();
        for (int i=0;i<n;i++){
            if (hash.contains(a[i]))dp[a[i]-1]=false;
            else hash.add(a[i]);
            int c = 2;
            if (a[i]*2<=dp.length)dp[a[i]*2-1]=false;
            while (a[i]*(c+1)<=dp.length){
                dp[a[i]*(c+1)-1]=false;
                c++;
            }
        }
        int ans = 0;
        for (boolean b : dp) if (b) ans++;
        System.out.println(ans);
    }
}
