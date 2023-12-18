import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int d[] = new int[n];
    int sum = 0;
    for(int i = 0; i < n; i++) {
      d[i] = Integer.parseInt(sc.next());
    }
    for(int i = 0; i < n; i++) {
      for(int j = i+1; j < n; j++) {
        sum = sum + d[i] * d[j];
      }
    }
    System.out.println(sum);
  }
}