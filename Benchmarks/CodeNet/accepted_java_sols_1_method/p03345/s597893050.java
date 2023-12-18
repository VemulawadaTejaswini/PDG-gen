import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()){
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();
      long K = in.nextLong();
      
      if (K % 2 == 0) {
        System.out.println(A - B);
      } else {
        System.out.println(B - A);
      }
    }
  }
}