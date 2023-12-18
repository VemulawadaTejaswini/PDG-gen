import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int a, b, c;
    double s, l, h, rad;
    
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    rad = Math.toRadians(c);
    s = 0.5 * a * b * Math.sin(rad);
    l = a + b + Math.sqrt(a * a + b * b - (2 * a * b * Math.cos(rad)));
    h = b * Math.sin(rad);

    System.out.println(s);
    System.out.println(l);
    System.out.println(h);
  }
}