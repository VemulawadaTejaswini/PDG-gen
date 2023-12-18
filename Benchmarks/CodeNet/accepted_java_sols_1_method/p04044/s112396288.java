import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int L = sc.nextInt();
    String[] S = new String[N];
    
    for(int i = 0; i < N; i++) {
        String token = sc.next();
        S[i] = token;
    }
    Arrays.sort(S);
    System.out.println(String.join("",S));
  }
}
