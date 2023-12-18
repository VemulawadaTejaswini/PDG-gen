import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    long[] as = new long[N];
    long[] dp = new long[N];
    String[] firstInput = sc.nextLine().split("[\\s]+");
    for(int i = 0; i < N; i++) {
      as[i] = Long.parseLong(firstInput[i]);
    }
    Arrays.sort(as);
    System.out.println(Math.abs(as[0] - as[N -1]));
  }
}
