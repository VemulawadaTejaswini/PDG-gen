import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt()-1;
    }
    
    int c = 0;
    for (int i = 0; i < N; i++) {
      if (a[a[i]] == i) {
        c++;
      }
    }
    System.out.println(c/2);
  }
}