import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] L = new int[M+1];
    int[] R = new int[M+1];
    for (int i = 1; i <= M; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }

    int mostL = 1;
    int mostR = N;
    for (int i = 1; i <= M; i++) {
      if (mostL < L[i]) {
        mostL = L[i];
      }
      if (R[i] < mostR) {
        mostR = R[i];
      }
    }

    int ans = 0;
    for (int i = mostL; i <= mostR; i++) {
      ans++;
    }
        
    //System.out.println("L: " + Arrays.toString(L));
    //System.out.println("R: " + Arrays.toString(R));
    //System.out.println("cards: " + Arrays.toString(cards));
    
    System.out.println(ans);
  }
}

