import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int D = sc.nextInt();
    int N = sc.nextInt();

    sc.close();
    
    if (N != 100) {
      System.out.println(N * (int)Math.pow(100,D));
    } else {
      System.out.println((N + 1) * (int)Math.pow(100,D));
    }
    
  }

}