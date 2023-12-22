import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N+1];
      
        int min = 0;
        int Max = 0;
      
      for (int i=1; i<=N; i++) {
        values[i] = sc.nextInt();

        if (min == 0 || values[i] < min) {
          min = values[i];
        }  
        
        if (Max == 0 || Max < values[i]) {
          Max = values[i];
        }  

      }
                   
        System.out.println(Max - min);
    }
}