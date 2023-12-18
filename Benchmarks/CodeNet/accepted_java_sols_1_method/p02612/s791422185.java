import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1000;
    while (N > 0) {
    	N -= i;
    }
    System.out.println(Math.abs(N));
  }
}