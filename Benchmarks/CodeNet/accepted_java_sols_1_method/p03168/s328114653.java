import java.util.*;

public class Main {
    private static final int MOD = (int) (1e9+7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n+1];
        arr[0] = 1;
        for(int i =0;i<n ; ++i){
            double p = scanner.nextDouble();
            for(int r = i+1 ; r>0;--r){
                arr[r] = arr[r]*(1-p) + arr[r-1]*p;
            }
            arr[0] = arr[0]*(1-p);
        }
        double ans = 0;
        for(int i = 0 ; i<=n ; ++i){
            if(i>n-i) ans+=arr[i];
        }
        System.out.println(ans);
    }
}

























/*
*         double[] arr = new double[n+1];
        arr[0] = 1;
        for(int i=0;i<n ; ++i){
            double p = scanner.nextDouble();
            for(int r = i+1 ; r>=1 ; --r){
                arr[r] = arr[r]*(1-p) + arr[r-1]*p;
            }
            arr[0] = arr[0]*(1-p);
        }
        double ans=0;
        for(int i = 0 ; i <=n ; ++i){
            if(i>n-i) ans+=arr[i];
        }
        System.out.println(ans);
*/