import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    Set<Integer> hashSet = new HashSet<Integer>();

    for (int i = 0; i < N; i++) {
      if (hashSet.contains(A[i])){
        hashSet.remove(A[i]);
      } else {
        hashSet.add(A[i]);
      }
    }

    System.out.println(hashSet.size());

  }

}