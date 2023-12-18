import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //荷物の個数
        int k = sc.nextInt(); //トラックの台数
        int[] w = new int[n]; //各荷物の重量
        int l = 0;
        for (int i=0; i<n; i++) {
            w[i] = sc.nextInt();
            l += w[i];
        }
        //二分探索を使う
        int left = 0;
        int right = l;
        int mid = 0;
        while(right-left>1) {
            mid = (left+right) / 2;
            int j = check(mid,k,w);
            if(j>=n) right = mid;
            else left = mid;
        }
        System.out.println(right);
    }

    static int check(int mid, int k, int[] w) {
        int sum = 0;
        int j = 0;
        for (int i=0; i<k; i++) {
            sum = 0;
            while(sum+w[j]<=mid) {
                sum+=w[j];
                j++;
                if(j==w.length) return w.length;
            }
        }
        return j;
    }
}

