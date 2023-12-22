public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c, n;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    n = 0;

    for(;a < (b + 1);a++){
      if(c % a == 0)++n;
    }

    System.out.println(n);
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}