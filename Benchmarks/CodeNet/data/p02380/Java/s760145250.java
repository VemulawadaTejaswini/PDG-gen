import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int a, b, c;
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    double rad, l, s, h;
    rad = c * Math.PI / 180.0;
    s = 1 / 2.0 * Math.sin(rad) * a * b;
    l = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(rad));
    h = 2 * s / a;

    System.out.println(s + "\n" + l + "\n" + h);
  }
}