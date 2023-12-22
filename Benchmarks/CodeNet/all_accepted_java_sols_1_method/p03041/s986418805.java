import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    if (s.charAt(k-1) == 'A'){
      System.out.println(s.substring(0,k-1)+"a"+s.substring(k));
    }
    if (s.charAt(k-1) == 'B'){
      System.out.println(s.substring(0,k-1)+"b"+s.substring(k));
    }
    if (s.charAt(k-1) == 'C'){
      System.out.println(s.substring(0,k-1)+"c"+s.substring(k));
    }
  }
}