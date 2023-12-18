public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, d, i;
    int[] b = new int[3];
    int[] c = new int[3];
    c[0] = 1000; c[1] = 500; c[2] = 100;
    for(;;){
      a = sc.nextInt(); d = sc.nextInt();
      if(a == 0 && d == 0)break;
      a = d - a;
      for(i = 0;i < 3;i++){
        b[i] = a / c[i];
        a -= b[i] * c[i];
      }
      out.printf("%d %d %d%n", b[2], b[1], b[0]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}