import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    
    long minCapacity = Long.MAX_VALUE;
    int minCapacityIndex = 0;
    long[] capacity = new long[5];
    for (int i = 0; i < 5; i++) {
      capacity[i] = sc.nextLong();
      if (capacity[i] < minCapacity) {
        minCapacity = capacity[i];
        minCapacityIndex = i;
      }
    }
    
    long ans = (N-1) / minCapacity + 5;

    System.out.println(ans);
  }  
}