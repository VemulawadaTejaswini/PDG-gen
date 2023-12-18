import java.util.*;
public class Main  {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int n = Integer.parseInt(a + b);

    int c = (int)Math.sqrt(n);
    if(c * c == n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

}
}
