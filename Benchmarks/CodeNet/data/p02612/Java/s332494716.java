import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n==10000) {
      System.out.println(0);
    }else{
      System.out.println(1000-n%1000);
    }

  }
}
