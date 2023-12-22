import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> d = new ArrayList<Integer>();
    for (int i=0; i<N; i++) {
      d.add(sc.nextInt());
    }
    int ans = new HashSet<>(d).size();
    System.out.println(ans);
  }
}