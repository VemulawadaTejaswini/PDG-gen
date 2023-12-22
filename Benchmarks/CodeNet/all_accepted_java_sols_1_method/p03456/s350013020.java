import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();    
    String b = sc.next();
    String ans = "No";
    int ab = Integer.parseInt(a + b);
    for(int i=1; i<317; i++) {
      if(ab == i * i) {
        ans = "Yes";
        break;
      }
      if(ab < i * i){
        break;
      }
    }
    System.out.println(ans);
  }
}
