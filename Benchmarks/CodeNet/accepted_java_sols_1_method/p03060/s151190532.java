import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < n; i++) v[i] = sc.nextInt();
        for(int i = 0; i < n; i++) c[i] = sc.nextInt();
        for(int i = 0; i < n; i++) d[i] = v[i] - c[i];
        Arrays.sort(d);
        int ans = 0;
        for(int i = n - 1; i >= 0; i--){
            if(d[i] >= 0) ans += d[i];
        }
        System.out.print(ans);
    }
}
