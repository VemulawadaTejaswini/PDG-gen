import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    for (int i=0; i<N; i++) {
      int key = sc.nextInt();
      array[key-1] = i+1;
    }
    for (int j=0; j<N; j++)
      System.out.println(array[j]);
  }
}