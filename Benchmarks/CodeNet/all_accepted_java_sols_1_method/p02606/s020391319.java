import java.util.*;
 
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int l = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    sc.close();
    
    System.out.println( r/d - (l-1)/d );
  }
}