import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer[] A = new Integer[N];
    Integer[] B = new Integer[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = A[i];
    }
    sc.close();

    Arrays.sort(B, Collections.reverseOrder());

    for (int i = 0; i < N; i++) {
      if (A[i] == B[0]){
        System.out.println(B[1]);
      } else {
        System.out.println(B[0]);
      }
    }
    
  }
  
}