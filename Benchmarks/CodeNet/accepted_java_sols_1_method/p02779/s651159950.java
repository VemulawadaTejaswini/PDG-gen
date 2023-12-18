import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<String> a = new HashSet<>();
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      a.add(sc.next());
    }
    if (N == a.size()) {
      System.out.println("YES"); 
    } else {
      System.out.println("NO"); 
    }
  }
}