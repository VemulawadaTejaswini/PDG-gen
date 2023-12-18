import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][2];
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
      }
      Arrays.sort(arr, (a, b) -> a[1] - b[1]);
      long total = 0;
      for(int i = 0; i < arr.length; i++) {
       
        int cost = arr[i][0];
         total += cost;
        int deadLine = arr[i][1];
        if(total > deadLine) {
          System.out.println("No");
          return;
        }
      }
      System.out.println("Yes");
  }
}