import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    int D = scanner.nextInt();
    int N = scanner.nextInt();
 
    if ( N == 100) {
      N++;
    }
    if ( D == 0 ) {
        System.out.println(N);
    } else if ( D == 1) {
      System.out.println(100*N);
    } else {
      System.out.println(10000*N);
    }
  }
}