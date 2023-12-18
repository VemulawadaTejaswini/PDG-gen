import java.util.*;

class Main  {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int S = scanner.nextInt();

    System.out.printf("%d:%d:%d\n" , S/3600, S/36000, S%60);
  }
}