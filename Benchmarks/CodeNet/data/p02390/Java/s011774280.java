import java.util.*;

class Main  {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int s = scanner.nextInt();

    int h = s/3600;
    s = s%3600;
    int m = s/60;
    s = s% 60;

    System.out.printf("%d:%d:%d\n" , h , m , s);
  }
}