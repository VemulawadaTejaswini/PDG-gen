import java.util.*;

public class Main{
  public static void main(String[] arts){
    Scanner scan = new Scanner(System.in);
    int p = scan.nextInt();
    int q = scan.nextInt();
    int r = scan.nextInt();
    int con = p + q + r - Math.max(p,Math.max(q,r));
    
    System.out.println(con);
  }
}