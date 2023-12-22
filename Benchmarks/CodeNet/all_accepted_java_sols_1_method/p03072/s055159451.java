import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] Hs = new int[N];
    for (int i = 0; i < N; i++) {
      Hs[i] = sc.nextInt();
    }
    int maxh = Hs[0];
    int seeSea = 0;
    for (int i = 0; i < N; i++) {
      if (Hs[i] >= maxh) {
        seeSea++;
        maxh = Hs[i];
      }
    }
    System.out.println(seeSea);
  }
}