public class Main {
  public static void main(String[] args) {
    java.util.Scanner s = new java.util.Scanner(System.in);
    java.math.BigInteger ans = java.math.BigInteger.valueOf(1);
    int n = s.nextInt();

    for (int i = 0; i < n; i++) {
      long a = s.nextLong();
      ans = ans.multiply(java.math.BigInteger.valueOf(a));
    }
    if (ans.compareTo(java.math.BigInteger.valueOf(1000000000000000000L)) == 1) {
      System.out.println(-1);
    } else {
      System.out.println(ans.longValue());
    }
  }
}
