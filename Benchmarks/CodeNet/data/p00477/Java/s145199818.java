public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int t = 0;
    for(;sc.hasNext();)t += sc.nextInt();
    out.printf("%d%n%d%n", t / 60, t % 60);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}