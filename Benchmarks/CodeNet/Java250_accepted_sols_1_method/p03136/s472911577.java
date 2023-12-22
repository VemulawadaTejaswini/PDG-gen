import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    int[] L = new int[N];

    for (int i = 0; i < N; i++) {
      L[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(L);

    int sum = 0;

    for (int i = N-2; 0 <= i; i--) {
      sum += L[i];
    }

    if (L[N-1] < sum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}