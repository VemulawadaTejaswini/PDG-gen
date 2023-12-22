import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int c = A - (B*2);
    int ans = c <= 0 ? 0 : c;
    System.out.println(ans);
  }
}