import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int a1 = (a / 10) * 10;
    if((a % 10) != 0) a1 = (a / 10) * 10 + 10;
    int a2 = a1 - a;

    int b = sc.nextInt();
    int b1 = (b / 10) * 10;
    if((b % 10) != 0) b1 = (b / 10) * 10 + 10;
    int b2 = b1 - b;

    int c = sc.nextInt();
    int c1 = (c / 10) * 10;
    if((c % 10) != 0) c1 = (c / 10) * 10 + 10;
    int c2 = c1 - c;

    int d = sc.nextInt();
    int d1 = (d / 10) * 10;
    if((d % 10) != 0) d1 = (d / 10) * 10 + 10;
    int d2 = d1 - d;

    int e = sc.nextInt();
    int e1 = (e / 10) * 10;
    if((e % 10) != 0) e1 = (e / 10) * 10 + 10;
    int e2 = e1 - e;

    int s = Math.max(a2, Math.max(b2, Math.max(c2, Math.max(d2, e2))));
    int ans = a1 + b1 + c1 + d1 + e1 - s;
    
    System.out.println(ans);
  }
}