public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int m, fi, y, n, tf, c, max, a, b, i;
    double p;

    m = sc.nextInt();
    for(;m-- > 0;){
      fi = sc.nextInt(); y = sc.nextInt();
      max = fi;
      for(n = sc.nextInt();n-- > 0;){
        tf = sc.nextInt(); p = sc.nextDouble(); c = sc.nextInt();
        a = fi;
        if(tf == 0){
          b = 0;
          for(i = 0;i < y;i++){
            b += (int)(a * p); a -= c;
          }
          if(max < a + b)max = a + b;
        }else{
          for(i = 0;i < y;i++){
            b = (int)(a * p); a += b - c;
          }
          if(max < a)max = a;
        }
      }
      out.println(max);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}