import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] H = new int[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    sc.close();

    int prev = -999999; 

    for (int i = 0; i < N; i++) {

      if (prev <= H[i] - 1) {
        H[i]--;
        prev = H[i];
      } else if (prev <= H[i]) {
        prev = H[i];
      } else {
        System.out.println("No");
        return;
      }

    }

    System.out.println("Yes");
    
  }

}