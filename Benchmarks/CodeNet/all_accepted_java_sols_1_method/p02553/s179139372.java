import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] n = Arrays.stream(sc.nextLine().split(" "))
      .mapToLong(Long::parseLong).toArray();
    long ans = Long.MIN_VALUE; 
    for (int i = 0; i <= 1; i++) {
      for (int j = 2; j <= 3; j++) {
        ans = Math.max(ans, n[i]*n[j]);
      }
    }
    System.out.println(ans);
  }
}