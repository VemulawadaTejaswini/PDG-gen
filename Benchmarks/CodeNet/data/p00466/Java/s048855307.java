public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int t, i;

    t = sc.nextInt();
    for(i = 0;i < 9;i++)t -= sc.nextInt();
    out.println(t);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}