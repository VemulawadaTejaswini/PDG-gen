import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int W = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    if (b > a+W) {
      System.out.println(Math.abs(b-(a+W)));
    } else if (a > b+W){
      System.out.println(Math.abs(a-(b+W)));
    } else {
      System.out.println(0);
    }
  }
}
