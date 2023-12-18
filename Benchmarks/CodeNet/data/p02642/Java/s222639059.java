import java.util.*;
import java.util.stream.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> A = new LinkedList<>();
    for (int i = 0; i < N; i++) A.add(sc.nextInt());
    Collections.sort(A);
   // System.out.println(A.toString());
    int ans = 0;
    while (!A.isEmpty()) {
      int n = A.get(0);
      A.remove(0);
      if (!A.contains(n)) ans++;
      A = A.stream().filter(e -> e % n != 0).collect(Collectors.toList());
      //System.out.println(A.toString());
    }
    System.out.println(ans);
  }
}