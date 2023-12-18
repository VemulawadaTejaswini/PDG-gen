import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] spots = new int[n + 1];

      int cost = 0;
      int prev = 0;
      for(int i = 1; i <= n; i++) {
        spots[i] = sc.nextInt();
        cost += Math.abs(spots[i] - prev);
        prev = spots[i];
      }
      cost += Math.abs(prev);
      
      for(int i = 1; i < spots.length; i++) {
        prev = spots[i-1];
        int next = spots[0];
        if(i < n) {
          next = spots[i+1];
        }
        System.out.println(cost - Math.abs(spots[i] - prev) - Math.abs(spots[i] - next) + Math.abs(prev - next));
      }
      
  }
}