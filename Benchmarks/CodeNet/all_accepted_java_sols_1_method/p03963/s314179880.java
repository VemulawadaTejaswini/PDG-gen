import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int KK =1;
    for (int i=1; i<=N-1; i++) KK *= K-1;
    System.out.println(K * KK);
  }
}