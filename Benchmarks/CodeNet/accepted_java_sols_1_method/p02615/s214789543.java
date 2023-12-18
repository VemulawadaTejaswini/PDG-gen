
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for(int i=1;i<n;i++) {
            ans += a[n-1-i/2];
        }
        System.out.println(ans);
    }
}
