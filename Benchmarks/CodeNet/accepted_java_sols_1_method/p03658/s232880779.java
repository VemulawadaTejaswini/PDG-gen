import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);

        int cnt = 0;
        for (int i = n-1; i > n-k-1; i--) {
            if (i < 0)  break;
            cnt += l[i];
        }
        
        System.out.print(cnt);
    }
}
