import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long ans = 0;
        for(int i = 0;i<n;i++){
            int tmp = sc.nextInt();
            a[i] = tmp;
            ans += tmp;
        }
        Arrays.sort(a);
        ans -= a[0];
        System.out.println(ans);




    }


}
