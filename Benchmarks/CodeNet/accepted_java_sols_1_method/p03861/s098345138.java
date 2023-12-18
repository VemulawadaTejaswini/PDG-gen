import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    sc.close();

    long a_ = a/x;

    if (a%x == 0) {
      a_--;
    }

    long b_ = b/x;

    System.out.println(b_ - a_);

  }

}