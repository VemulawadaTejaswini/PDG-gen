import java.util.*;
import static java.lang.System.*;

class Main{
  public static void main(String[] a){
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int y = (n+x-1)/x;
    out.print(y * t);
  }
}