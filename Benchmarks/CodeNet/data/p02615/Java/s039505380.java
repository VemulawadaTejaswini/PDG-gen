import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 配列
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = 0;
        for (int i=n-2;i>=0;i-- ) {
            ans+=a[i+1];
        }
        System.out.println(ans);
    }
}
