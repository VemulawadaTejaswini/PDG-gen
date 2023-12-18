import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    // a, k, i, h, b, r
    int[] a = new int[6];
    int[] b = new int[6];
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(c == 'A') { 
        a[0] += 1;
        b[0] = i;
      }
      if(c == 'K') { 
        a[1] += 1;
        b[1] = i;
      }
      if(c == 'I') { 
        a[2] += 1;
        b[2] = i;
      }
      if(c == 'H') { 
        a[3] += 1;
        b[3] = i;
      }
      if(c == 'B') { 
        a[4] += 1;
        b[4] = i;
      }
      if(c == 'R') { 
        a[5] += 1;
        b[5] = i;
      }
    }
    String ans = "NO";
    int sum = 0;
    for(int i = 0; i < 6; i++) {
      sum += a[i];
    }
    if(sum == s.length()) {
      if((a[0] < 5) && (a[1] == 1) && (a[2] == 1) && (a[3] == 1) && (a[4] == 1) && (a[5] == 1) && ((b[1] < b[2]) && (b[2] < b[3]) && (b[3] < b[4]) && (b[4] < b[5]))) {
        
        if((b[1] <= 1) && (b[2] == b[1] + 1) && (b[3] == b[2] + 1) && (b[4] <= b[3] + 2) && (b[5] <= b[4] + 2) && (b[5] >= s.length() - 2)) ans = "YES";
      }
    }
    System.out.println(ans);
  }
}