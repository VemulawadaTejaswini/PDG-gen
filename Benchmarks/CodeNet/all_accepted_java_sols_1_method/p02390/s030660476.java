import java.util.Scanner;

public class Main {
  /*
     input: 46979
     output: 13:2:59
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int S = scan.nextInt();
    int h = S / 3600;
    int m = (S % 3600) / 60;
    int s = (S % 3600) % 60 % 60;
    System.out.printf("%d:%d:%d\n", h,m,s);
  }
}
