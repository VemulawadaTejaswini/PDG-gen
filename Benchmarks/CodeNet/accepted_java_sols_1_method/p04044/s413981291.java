import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    ArrayList<String> S = new ArrayList<>();
    String ans = "";
    
    for(int i=0; i<N; i++) {
      S.add(sc.next());
    }
    Collections.sort(S);
    for(int j=0; j<N; j++) {
      ans += S.get(j);
    }
    System.out.println(ans);
  }
}