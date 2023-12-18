public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, k, s, i, j;

    for(;;){
      n = sc.nextInt(); k = sc.nextInt(); s = sc.nextInt();
      if(n == 0 && k == 0 && s == 0)break;
      out.println(solve(n, k, s));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int solve(int n, int k, int s){
    if(k == 0 && s == 0)return 1;
    if(n == 0)return 0;
    return solve(n - 1, k - 1, s - n) + solve(n - 1, k, s);
  }
}