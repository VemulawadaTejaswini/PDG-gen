import javafx.util.Pair;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;++i) {
            a[i]=sc.nextInt();
        }
//        int dp[][][]=new int[80][20000][];
//
//        for(int i[][]:dp)
//            for(int )

        System.out.println(maxM(1000,0,a,0,new HashMap<>()));
    }
    public static int maxM(int lmoney, int i, int a[], int stock, HashMap<Integer,HashMap<Pair<Integer,Integer>,Integer>> dp) {
        if(i==a.length)
            return lmoney;
        Pair<Integer,Integer> p=new Pair(lmoney,stock);
        if(dp.containsKey(i)&&dp.get(i).containsKey(p))
            return dp.get(i).get(p);
        int stocks=lmoney/a[i];
        int max=lmoney;
        for(int j=0;j<=stocks;++j) {
            int aa=lmoney-a[i]*j;
            max=Math.max(max,maxM(aa,i+1,a,stock+j,dp));
        }
        for(int j=1;j<=stock;++j) {
            int aa=lmoney+a[i]*j;
            max=Math.max(max,maxM(aa,i+1,a,stock-j,dp));
        }
//        dp[i][lmoney][stock]=max;
        if(!dp.containsKey(i))
            dp.put(i,new HashMap<>());
        HashMap<Pair<Integer,Integer>, Integer> hm=dp.get(i);
        hm.put(p,max);
        return max;
    }
}
