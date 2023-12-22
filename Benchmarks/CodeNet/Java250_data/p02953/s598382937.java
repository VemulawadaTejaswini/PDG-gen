import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    String ans = "Yes";
    h[0]--;
    for(int i = 1; i < n; i++) {
      if(h[i] > h[i - 1]) {
        h[i]--;
      } else if(h[i] == h[i - 1]) {
        
      } else {
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}