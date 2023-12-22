import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a == 0) break;

      int n = sc.nextInt();
      while(n-- > 0){
        int r = 2 * sc.nextInt();
        r *= r;
        if(r > a*a+b*b || r > a*a+c*c || r > b*b+c*c){
          System.out.println("OK");
        }
        else{
          System.out.println("NA");
        }
      }
    }
  }
}