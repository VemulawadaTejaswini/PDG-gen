import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    //１人につき2d+1本の木を監視できる
    int a = n / (2*d + 1);
    int b = 0;
    if (n % (2*d + 1) != 0) {
      b = 1;
    }
    int c = a+b;
    System.out.println(c);
  }
}