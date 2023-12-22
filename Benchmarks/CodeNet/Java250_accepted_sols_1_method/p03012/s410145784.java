import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] W = new int[N];
    int total = 0, S1 = 0, S2 = 0, min = 10000;
    for (int i=0; i<N; i++) {
      W[i] = sc.nextInt();
      total += W[i];
    }
    for (int i=0; i<N; i++) {
      for (int j=0; j<i; j++) {
        S1 += W[j];
      }
      S2 = total - S1;
      min = Math.min(Math.abs(S1 - S2), min);
      S1 = 0; S2 = 0;
    }
    System.out.println(min); 
  }
}