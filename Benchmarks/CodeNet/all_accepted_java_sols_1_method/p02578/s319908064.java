import java.util.*;
public class Main {
  public static void main(String[] args) {
  	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++) {
     arr[i] = s.nextInt(); 
    }
    
    long total = 0;
    for(int i=1;i<n;i++) {
     int v = arr[i-1] - arr[i];
      if(v > 0) {
       arr[i] += v;
       total += (long)v;
      }
    }
    System.out.println(total);
  }
}
