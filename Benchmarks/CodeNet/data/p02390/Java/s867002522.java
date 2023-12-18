public class Main {
  public static void main(String[] args) {
    int s = new java.util.Scanner(System.in).nextInt();
    int m = s / 60;
    int r = s % 60;
    int h = m / 60;
    int n = m % 60;
    System.out.println(h + ":" + n + ":" + r);
  }
}