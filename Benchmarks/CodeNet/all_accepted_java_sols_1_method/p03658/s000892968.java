import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer[] l = new Integer[N];
    for (int i=0; i<N; i++) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l,Collections.reverseOrder());
    int total =0;
    for (int i=0; i<K; i++) {
      total += l[i];
    }
    System.out.println(total);
  }
}