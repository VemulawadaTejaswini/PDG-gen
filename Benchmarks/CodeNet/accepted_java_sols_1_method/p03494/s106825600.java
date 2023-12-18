import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    boolean odd = false;
    int cnt = 0;
    
    while(true) {
      for(int i = 0; i < n; i++) {
        if(a[i]%2 == 0) {
          a[i] /= 2;
        } else {
          odd = true;
          break;
        }
      }
      if(odd) {
        break;
      } else {
        cnt++;
      }
    }
  
    System.out.print(cnt);
    
  }
}
