import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int res = 0;
    for (int i = 1; i <= N; i++) {
        int n = i;
        int digSum = 0;
        
        while(n > 0) {
            digSum += n % 10;
            n /= 10;
        }
        if (digSum >= A && digSum <= B) {
            res += i;
        }
    }
    
    System.out.println(res);
  }
}
