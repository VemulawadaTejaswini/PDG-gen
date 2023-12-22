import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double tmp = 0.0;
    
    for (int i = 0; i< N;i++) {
     tmp += (1.0 / sc.nextDouble());
    }
    
    System.out.println(1.0 / tmp);
  }
}