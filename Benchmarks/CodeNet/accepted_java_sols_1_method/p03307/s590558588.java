import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()){
      long N = in.nextInt();
      
      if (N % 2 == 0){
        System.out.println(N);
      } else {
        System.out.println(2 * N);
      }
    }
  }
}