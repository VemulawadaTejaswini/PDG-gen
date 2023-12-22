import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int a = 10000, b = 5000, c = 1000;

        for(int x = 0; x <= n; x++) {
            for(int y = 0; y <= n; y++) {
                int curSum = x * a + y * b + (n - x - y) * c;
                if(curSum == s && (n - x - y) >= 0) {
                    System.out.println(x + " " + y + " " + (n - x - y));
                    return;
                }

            }
        }

        System.out.println("-1 -1 -1");
    }
}