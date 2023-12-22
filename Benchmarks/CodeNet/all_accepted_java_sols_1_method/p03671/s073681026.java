import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if ((b <= a) && (c <= a)) {
      System.out.println(b + c);
    } else if ((a <= b) && (c <= b)) {
      System.out.println(a + c);
    } else {
      System.out.println(a + b);
    }

  }
}