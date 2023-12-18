import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int f;
    int g;
    int h;

    int w = 10*a+b+c;
    int x = a+(10*b+c);
    int y = 10*c+b+a;
    int z = c+(10*b+a);

    f = Math.max(w,x);
    g = Math.max(f,y);
    h = Math.max(g,z);

    System.out.println(h);

  }
}
