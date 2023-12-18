import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[n];

        for (int i=0; i<n+1; i++) a[i]=sc.nextInt();
        for (int i=0; i<n; i++) b[i]=sc.nextInt();

        long ans = 0;

        for (int i=0; i<n; i++){
            if (b[i]<=a[i]){
                ans += b[i];
            }else {
                ans += a[i];
                int diff=b[i]-a[i];
                int min=Math.min(diff, a[i+1]);
                ans += min;
                a[i+1] -= min;
            }
        }
        System.out.println(ans);

    }
}
