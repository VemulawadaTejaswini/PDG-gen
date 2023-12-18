import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();

    if(n%2 == 1){
      System.out.println("No");
      return;
    }
    
    String sub1 = s.substring(0,n/2);
    String sub2 = s.substring(n/2, n);
    
    if(sub1.equals(sub2)){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
