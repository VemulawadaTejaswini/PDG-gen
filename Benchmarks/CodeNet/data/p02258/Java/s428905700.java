import java.util.*;
public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i ++) {
         arr[i] = Integer.parseInt(sc.nextLine());
      }
      
      int max = arr[1] - arr[0];
      
      for(int i = 0; i < n; i ++) {
         for(int j = i + 1; j < n; j ++) {
            int dif = arr[j] - arr[i];
            if(dif > max) {
               max = dif;
            }
         }
      }
      
      System.out.println(max);
      
   }
}
