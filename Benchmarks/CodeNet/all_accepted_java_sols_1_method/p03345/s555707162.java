import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    long K = Long.parseLong(sc.next());
    if (K % 2 == 0) {
      System.out.println(A - B);
    } else {
      System.out.println(B - A);
    }
    
  }
}