import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    String t = sc.next();
    int ans = 0;
    int[] kati = new int[k];
    for(int i = 0; i < t.length(); i++) {
      if(((i - k) >= 0) && (t.charAt(i - k) == t.charAt(i))) {
        if(kati[i % k] == 1) {
          kati[i % k] = 0;
        } else {
          kati[i % k] = 1;
          if(t.charAt(i) == 'r') {
            ans += p;
          } else if(t.charAt(i) == 's') {
            ans += r;
          } else {
            ans += s;
          }
        }
      } else {
        kati[i % k] = 1;
        if(t.charAt(i) == 'r') {
          ans += p;
        } else if(t.charAt(i) == 's') {
          ans += r;
        } else {
          ans += s;
        }        
      }
    }
    System.out.println(ans);
  }
}
