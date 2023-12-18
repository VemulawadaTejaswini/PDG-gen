import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); 
        }
        int count = 0;
        while (true) { 
            boolean foundAdd = false;
            boolean foundSub = false;
            for (int i = 0; i < nums.length; i++) {
                if (x + count == nums[i]) {
                    foundAdd = true;
                }
                if (x - count == nums[i]) {
                    foundSub = true;
                }
            }
            if (!(foundSub)) {
                System.out.println(x - count);
                break;
            }
            else if (!(foundAdd)) {
                System.out.println(x + count);
                break;
            }
            count++;
        }
    }
}
