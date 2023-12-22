import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    int d = a+b;
    int e = a+c;
    int f = b+c;

    int[] g = {d,e,f};
    int h = g[0];

    for(int i = 0; i < g.length; i++){
      h = Math.min(h,g[i]);

    }
    System.out.println(h);
  }
}
