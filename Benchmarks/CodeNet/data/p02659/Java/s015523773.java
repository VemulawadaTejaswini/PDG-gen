import java.util.*;
import java.util.stream.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    int B = (int)(sc.nextDouble() * 100.0);
    System.out.println(A*B/100);
  }
}