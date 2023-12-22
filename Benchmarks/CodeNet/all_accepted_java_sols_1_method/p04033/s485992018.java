import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), m = scan.nextInt();

    if(n==0||m==0||((long)n*(long)m<0L)) {
      System.out.println("Zero");
      return;
    }

    if(n>0) {
      System.out.println("Positive");
      return;
    }

    if(m<0) {
      if((m-n)%2==0) System.out.println("Negative");
      else System.out.println("Positive");
      return;
    }
  }
}
