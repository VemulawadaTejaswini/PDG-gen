
import java.util.*;
 
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] aList = new int[n];
    for (int i=0; i<n; i++) {
      aList[i] = sc.nextInt();
    }
    
    int cnt = n;
    int ai;
    int aj;
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        if ( (i != j) && (aList[i] % aList[j] == 0) ) {
          cnt--;
          break;
        }
      }
    }
    
    System.out.println(cnt);
  }
}
