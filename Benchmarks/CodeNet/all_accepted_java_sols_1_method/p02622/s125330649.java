import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int n =s.length(), res = 0;
    
    for(int i = 0; i < n; i++) {
      if(s.charAt(i) != t.charAt(i))
        res++;
    }
    
    System.out.println(res);
  }
}
