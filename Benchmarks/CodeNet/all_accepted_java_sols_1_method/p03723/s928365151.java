import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int counter = 0;
    
    if(A==B && B==C && A%2==0){
      System.out.println(-1);
    } else {
      while(A%2==0 && B%2==0 && C%2==0) {
        counter++;
        long a = B / 2 + C / 2;
        long b = C / 2 + A / 2;
        long c = A / 2 + B / 2;
        
        A = (int)a;
        B = (int)b;
        C = (int)c;
      }
      System.out.println(counter);
    }
  }
}