public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i;
    boolean[] y;

    y = new boolean[30];
    for(i = 0;i < 28;i++){
      n = sc.nextInt(); y[--n] = true;
    }
    for(n = 0;n < 30;n++)if(!y[n])out.println(n + 1);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}