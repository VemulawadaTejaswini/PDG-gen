public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[][] f;
    int n, i, j, l, m, r, x;

    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      f = new char[n][n];
      for(i = 0;i < n;i++){
        s = sc.next();
        for(j = 0;j < n;j++)f[i][j] = s.charAt(j);
      }
      l = 0; r = n;
      for(x = 0;x < 12;x++){
        m = (l + r) / 2;
        if(solve(f, n, m))l = m;
        else r = m;
      }
      out.println(l);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean solve(char[][] f, int n, int m){
    int i, j, k, l = 0;
    boolean b;
    if(m == 0)return true;
    for(i = 0;i < n + 1 - m;i++)for(j = 0;j < n + 1 - m;j++){
      b = true;
      for(k = 0;k < m && b;k++)
        for(l = 0;l < m;l++)if(f[i + k][j + l] == '*'){ b = false; break; }
      if(k == m && l == m)return true;
    }
    return false;
  }
}