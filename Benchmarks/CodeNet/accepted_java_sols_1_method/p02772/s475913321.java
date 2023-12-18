import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ans = "APPROVED";

    int n = sc.nextInt();
    int a;
    for(int i=0; i<n; ++i) {
      a = sc.nextInt();
      if( a % 2 == 0 && a % 3 != 0 && a%5 != 0 ) {
        ans = "DENIED";
        break;
      }
    }
    System.out.println(ans);
  }
}