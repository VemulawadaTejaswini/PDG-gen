//package atcoderdp;
import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(find(a,n));
    }
    public static int find(int a[],int n){
        if(n<2)
            return 0;
        int dp[]=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=Math.abs(a[1]-a[0]);
        //System.out.println(Arrays.toString(dp));
        for (int i = 2; i <n ; i++) {
            dp[i]=Math.min(dp[i-1]+Math.abs(a[i-1]-a[i]),dp[i-2]+Math.abs(a[i-2]-a[i]));
        }
        //System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }
}
