import java.util.*;
public class Main {
    public static int findMaxDiff(int[] arr) {
      int min_so_far = arr[0];
      int global_max = arr[1] - arr[0];
      
      for(int i=1; i<arr.length; i++) {
        global_max = Math.max(global_max, arr[i]-min_so_far);
        min_so_far = Math.min(min_so_far, arr[i]);
      }
      
      return global_max;
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = Integer.parseInt(sc.next());
      }
      
      int result = findMaxDiff(arr);
      System.out.println(result);
    }
}
