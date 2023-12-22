import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    //abc
    if(a <= b && b <= c)
      System.out.println(a + " " + b + " " + c);
    //acb
    else if(a <= c && c <= b)
      System.out.println(a + " " + c + " " + b);
    // bac
    else if(b <= a && a <= c)
      System.out.println(b + " " + a + " " + c);
    // bca
    else if(b <= c && c <= a)
      System.out.println(b + " " + c + " " + a);
    // cab
    else if(c <= a && a <= b)
      System.out.println(c + " " + a + " " + b);
    // cba
    else if(c <= b && b <= a)
      System.out.println(c + " " + b + " " + a);
  }
}
