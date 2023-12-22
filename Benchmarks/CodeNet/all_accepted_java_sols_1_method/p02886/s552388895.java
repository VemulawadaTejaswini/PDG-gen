import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    ArrayList<Integer> d = new ArrayList();
    int ans = 0;
    int val = 0;
    for(int i=0; i<N; i++) {
      val = scan.nextInt();
      for(int j=0; j<d.size(); j++) {
        ans += val*d.get(j);
      }
      d.add(val);
    }
    System.out.println(ans);
  }
}