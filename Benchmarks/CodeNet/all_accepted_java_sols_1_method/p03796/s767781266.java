import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int mod = 1000000007;

    long result = 1;

    for (int i = 1; i <= N; i++) {
      result = (long) result * i % mod; 
    }

    System.out.println(result);

  }

}