import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 1;
    String s[] = new String[n];
    s[0] = sc.next();
    for (int i = 1; i < n; i++){
      String p = sc.next();
      s[i] = p;
      String g = s[i-1].substring(s[i-1].length() - 1);
      if (!(p.substring(0, 1).equals(g))){
        ans *= 0;
      }
    }
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n-1; j++){
        if (i != j){
          if (s[i].equals(s[j])){
            ans *= 0;
          }
        }
      }
    }
    System.out.println(ans == 0 ? "No" : "Yes");
  }
}