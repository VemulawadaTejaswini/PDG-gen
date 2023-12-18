public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i, c;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      c = 0;
      for(i = 5;i < 20000;i *= 5)c += n / i;
      out.println(c);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}