public class Main {
  public static void main(String[] args) {
    java.util.Scanner s = new java.util.Scanner(System.in);
    long a = s.nextLong();
    double b = s.nextDouble();

    System.out.println(java.math.BigDecimal.valueOf(a).multiply(java.math.BigDecimal.valueOf(b)).longValue());
  }
}
