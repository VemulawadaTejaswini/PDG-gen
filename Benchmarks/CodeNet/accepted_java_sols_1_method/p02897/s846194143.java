import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    if(n%2!=0) {
      System.out.println((double)(n/2+1)/n);
    } else {
      System.out.println(0.5);
    }
  }
}