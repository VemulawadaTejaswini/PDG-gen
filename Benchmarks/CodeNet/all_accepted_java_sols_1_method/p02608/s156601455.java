import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ans[] = new int[N+1];
        Arrays.fill(ans, 0);
        for (int x = 1;x<100; x++) {
            for (int y = 1; y<100; y++) {
                for(int z=1;z<100;z++){
                    int s = (int)(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (s <=N) {
                        ans[s] = ans[s]+1;
                    }
                }
                    // System.out.println(ans);
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(ans[i]);
        }

    }
}