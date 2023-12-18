public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, s;

    for(;;){
      n = sc.nextInt();
      s = sc.nextInt();
      if(n == 0 && s == 0)break;
      else if(s > 45)out.println(0);
      else out.println(solve(n, s, 9));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int solve(int n, int s, int r){
    if(n == 0 && s == 0)return 1;
    else if(n == 0 || s < 0 || r == -1)return 0;
    else return solve(n, s, r - 1) + solve(n - 1, s - r, r - 1);
  }
}