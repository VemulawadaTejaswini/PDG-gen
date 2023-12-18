import java.util.Scanner;

class Main {

  static final char[] ALPHA = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  static final long BASE = 26;
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      long n = s.nextLong();
      String name = "";
      if (n == 1) {
          System.out.println("a");
              return;
          }
          while (n != 0) {
              long rem = (n-1) % BASE;
              n = (n-1)/BASE;
              name = ALPHA[(int) (rem)] + name;
          }
          System.out.println(name);
  }
}
