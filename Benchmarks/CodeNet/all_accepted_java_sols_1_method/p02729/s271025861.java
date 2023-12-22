import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    if (n>1&&m>1) {
      System.out.println(n*(n-1)/2+m*(m-1)/2);
    }
    if (n>1&&m<2) {
      System.out.println(n*(n-1)/2);
    }
    if (n<2&&m>1) {
      System.out.println(m*(m-1)/2);
    }
    if (n<2&&m<2) {
      System.out.println(0);
    }
  }
}
