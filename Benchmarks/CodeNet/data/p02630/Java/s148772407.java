import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == b) {
                    nums[j] = c;
                }
            }
            int total = 0;
            for (int j = 0; j < nums.length; j++) {
                total += nums[j];
            }
            System.out.println(total);
        }
    }
}
