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
    String[] te = new String[n];
    for(int i = 0; i < n; i++) {
      if(t.charAt(i) == 'r') {
        if((i >= k) && (te[i - k].equals("p"))) {
          if((i + k) >= n) {
            te[i] = "s";
          } else {
            if(t.charAt(i + k) == 'r') {
              te[i] = "s";
            } else if(t.charAt(i + k) == 's') {
              te[i] = "s";
            } else {
              te[i] = "r";
            }
          }
        } else {
          ans += p;
          te[i] = "p";
        }
      } else if(t.charAt(i) == 's') {
        if((i >= k) && (te[i - k].equals("r"))) {
          if((i + k) >= n) {
            te[i] = "s";
          } else {
            if(t.charAt(i + k) == 'r') {
              te[i] = "s";
            } else if(t.charAt(i + k) == 's') {
              te[i] = "s";
            } else {
              te[i] = "p";
            }
          }
        } else {
          ans += r;
          te[i] = "r";
        }        
      } else {
        if((i >= k) && (te[i - k].equals("s"))) {
          if((i + k) >= n) {
            te[i] = "r";
          } else {
            if(t.charAt(i + k) == 'r') {
              te[i] = "r";
            } else if(t.charAt(i + k) == 's') {
              te[i] = "p";
            } else {
              te[i] = "r";
            }
          }
        } else {
          ans += s;
          te[i] = "s";
        }        
      }
    }
    System.out.println(ans);
  }
}
