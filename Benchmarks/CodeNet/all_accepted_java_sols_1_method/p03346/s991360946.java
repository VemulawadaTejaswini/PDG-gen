import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] pos = new int[N];
    for (int i = 0; i < N; i++) {
      int P = sc.nextInt();
      P--;
      pos[P] = i;
    }
    
    int len = 1;
    int lenMax = 1;
    for (int i = 1; i < N; i++) {
      if (pos[i-1] < pos[i]) {
        len++;
        lenMax = Math.max(lenMax, len);
      } else {
        len = 1;
      }
    }
    
    System.out.println(N-lenMax);
  }
}
