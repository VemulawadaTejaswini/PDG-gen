import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            int ans = 0;
            for (int x = 1;x<100; x++) {
                for (int y = 1; y<100; y++) {
                    for(int z=1;z<100;z++){
                        if ((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x) == i) {
                            ans++;
                        }
                    }
                   // System.out.println(ans);
                }
            }
           System.out.println(ans);
        }
    }
}