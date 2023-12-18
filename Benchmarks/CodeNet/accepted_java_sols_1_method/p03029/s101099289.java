import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    int p = stdIn.nextInt();
    int k = 3*a;
    k = k + p;
    int u = 0;
    if(k%2==0) {
      u = k/2;
    } else {
      k = k -1;
      u = k/2;
    }
    System.out.println(u);

  }
}
