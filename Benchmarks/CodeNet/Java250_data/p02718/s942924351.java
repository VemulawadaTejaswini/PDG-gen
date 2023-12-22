import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
       int N = in.nextInt();
       int M = in.nextInt();
       int votes = 0;
       int[] nums = new int[N];

       for (int i = 0; i < N; i++) {
         nums[i] = in.nextInt();
       }


       for (int i = 0; i < N; i++) {
         votes += nums[i];
      }
       
       double minimum = (1.0 / (double) (4*M))* votes;
       int count = 0;
       Arrays.sort(nums);
       for (int i = 0; i < N; i++) {
         if (nums[i] >= minimum) count++;
       }
       if (count >= M) return "Yes";
       return "No";
      }
    
}