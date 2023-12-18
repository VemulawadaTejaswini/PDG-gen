public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a, b, c;
    int i, x, f, d;

    a = new int[4]; b = new int[4]; c = new int[5];
    c[0] = 10; c[1] = 50; c[2] = 100; c[3] = 500; c[4] = 500;
    f = 0;
    for(;;){
      x = sc.nextInt(); if(x == 0)break;
      if(f++ > 0)out.println();
      for(i = 0;i < 4;i++){
        a[i] = sc.nextInt(); b[i] = 0;
      }
      for(i = 0;i < 4;i++){
        if(x % c[i + 1] <= c[i] * a[i] && x % c[i + 1] > 0){
          b[i] = x % c[i + 1] / c[i];
          x -= b[i] * c[i];
          if(x > 0 && x < c[i]){ b[i]++; break; }
        }
      }
      for(i = 0;i < 4;i++)a[i] -= b[i];
      for(i = 4;i-- > 0;)if(a[i] > 0){
        d = x / c[i];
        if(a[i] < d)d = a[i];
        b[i] += d;
        x -= d * c[i];
      }
      for(i = 0;i < 4;i++)if(b[i] > 0)out.println(c[i] + " " + b[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}