import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int l = sc.nextInt();;

    int total = m + n + l ;

    if (total >=22) {
      System.out.println("bust");
    } else {
      System.out.println("win");
    }
  }
}
