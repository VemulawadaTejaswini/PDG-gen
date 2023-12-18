import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += prices[i];
        }
        System.out.println(total);
    }
}
