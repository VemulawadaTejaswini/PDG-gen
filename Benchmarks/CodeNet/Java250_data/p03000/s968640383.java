import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] d = new int[n+2];
        d[0] = 0;
        for (int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
            d[i] += d[i-1];
        }
        d[n+1] = Integer.MAX_VALUE;
        for(int i = 0; i < n+2; i++) {
          if(x < d[i]) {
        	System.out.println(i);
            return;
          }
        }
    }
}
