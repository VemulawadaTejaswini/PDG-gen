public class Main{
  static int f = 10001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, a, b, c, x, y, t, i;

    for(;;){
      n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
      c = sc.nextInt(); x = sc.nextInt();
      if(n == 0 && a == 0 && b == 0 && c == 0 && x == 0)break;
      t = -1;
      for(i = 0;i < n;i++){
        y = sc.nextInt();
        for(t++;t < f;t++){
          if(x == y)break;
          x = (a * x + b) % c;
        }
        x = (a * x + b) % c;
      }
      if(t < f)out.println(t);
      else out.println("-1");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}