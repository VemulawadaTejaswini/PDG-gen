import java.util.*;

public class Main {

  public static void main (String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();

    if(n == 1) {
      System.out.println("Hello World");
    } else {
      int a = stdIn.nextInt();
      int b = stdIn.nextInt();
      System.out.println(a + b);
    }


  }
}