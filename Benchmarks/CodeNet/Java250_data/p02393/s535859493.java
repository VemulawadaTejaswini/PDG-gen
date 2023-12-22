public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c, tmp;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if(a > b){
      tmp = a;
      a = b;
      b = tmp;
    }

    if(b > c){
      tmp = b;
      b = c;
      c = tmp;
    }

    if(a > b){
      tmp = a;
      a = b;
      b = tmp;
    }

    System.out.println(a + " " + b + " " + c);
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}