
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        long d[] = new long[n];

        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
            d[i] = b[i]-a[i];
        }

        Arrays.sort(d);
        long sum = 0;
        int ans=0;
        for(int i=0;i<n;i++)if(d[i]>0){
            sum+=d[i];
            ans++;
        }
        
        long sum2 = 0;
        for(int i=0;i<n;i++){
            if(sum2>=sum){
                System.out.println(ans+i);
                return;
            }
            sum2 -= d[i];
        }
        System.out.println(-1);




    }
}
