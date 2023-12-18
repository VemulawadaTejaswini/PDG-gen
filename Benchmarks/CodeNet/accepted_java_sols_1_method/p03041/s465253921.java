import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    String s = sc.next();
    
    String a = s.substring(0,k-1);
    String b = s.substring(k-1,k).toLowerCase();
    String c = s.substring(k,n);
    
    System.out.println(a+b+c);
  }
}