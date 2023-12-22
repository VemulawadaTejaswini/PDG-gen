import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        int idx = 0;
        int ans = 0;

        for (int i=0; i<n; i++){
            if (a[i]!=idx+1){
                ans++;
            }else {
                idx++;
            }
        }

        if (ans==n){
            System.out.println(-1);
        }else {
            System.out.println(ans);
        }

    }

}
