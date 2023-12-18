import java.util.*;
class Test{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = (n-(n%1000))%1000;
    System.out.println(res);
  }
}