import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int count;
        
    count = A;
    A = B;
    B = count;
    
    count = A;
    A = C;
    C = count;
    
    System.out.println(A + " " + B + " " + C);
  }
}
