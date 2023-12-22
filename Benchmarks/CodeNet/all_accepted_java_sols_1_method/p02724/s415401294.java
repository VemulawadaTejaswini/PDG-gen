import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long n = x/500;

    long m = (x-(n*500))/5;

    System.out.println(n*1000+m*5);
  }

}
