public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c, n, r, x;
    int i, tmp;

    for(;;){
      a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
      if(a + b + c == 0)break;
      if(a > b){
        tmp = a; a = b; b = tmp;
      }
      if(b > c){
        tmp = b; b = c; c = tmp;
      }
      if(a > b){
        tmp = a; a = b; b = tmp;
      }
      r = (a * a + b * b);
      n = sc.nextInt();
      for(i = 0;i < n;i++){
        x = sc.nextInt();
        if(4 * x * x > r)out.println("OK");
        else out.println("NA");
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}