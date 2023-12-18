public class Main {
  public static void main(String[] args) {
    for( int i = 0; i <10000; i++) {
      int a = new java.util.Scanner(System.in).nextInt();
      if (a != 0) {
        System.out.println("Case" + (i + 1) + ": " + a);
      } else {
        i = i + 10000;
      }
    }
  }
}