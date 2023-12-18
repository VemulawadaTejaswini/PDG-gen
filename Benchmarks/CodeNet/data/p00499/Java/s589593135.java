public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int l, a, b, c, d;
    l = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
    c = sc.nextInt(); d = sc.nextInt();
    if(a % c == 0)a /= c;
    else a = a / c + 1;
    if(b % d == 0)b /= d;
    else b = b / d + 1;
    if(a > b)b = a;
    out.println(l - b);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}