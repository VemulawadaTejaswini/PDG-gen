import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.next();

    char[] c = s.toCharArray();
    
    boolean ans = true;
    
    if(n % 2 == 1) {
      ans = false;
    } else {    

      for(int i = 0; i < n/2 ; i++) {
      if(c[i] != c[n/2+i]) {
        ans = false;
        break;
      }
    }
    }
    
    if(ans) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }      
    
    
  }
}