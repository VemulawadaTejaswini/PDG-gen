import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      long A = in.nextLong();
      long B = in.nextLong();
      long K = in.nextLong();
      
      if (K >= A) {
        K -= A;
        A = 0;
        
        if (K >= B) {
          K -= B;
          B = 0;
        } else {
          B -= K;
        }
      } else {
        A -= K;
      }
      
      System.out.println(A + " " + B);
    }
  }
}