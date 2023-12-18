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
        int res = 0;
        int tmp = 0;
        for (int i=n-2;i>=0;i-- ) {
            if(i < n-2 && a[i+1] == a[i+2] && a[i] == a[i+1]) {
                if(res==0) {
                    res++;
                }
                res++;
                tmp = a[i];
                ans+=a[i+1];
            } else if(res > 0) {
                res--;
                ans += tmp;
            } else {
                ans+=a[i+1];
            }
        }
        System.out.println(ans);
    }
}
