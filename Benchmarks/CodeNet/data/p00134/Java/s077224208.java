public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    long t = 0;
    int n, i;

    n = sc.nextInt();
    for(i = 0;i < n;i++)t += sc.nextLong();
    out.println(t / n);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}