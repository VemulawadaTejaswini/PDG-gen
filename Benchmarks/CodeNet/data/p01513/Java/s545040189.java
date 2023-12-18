public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, k, i, j, h, res;
    int[] m, l;
    int[][] p;

    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      m = new int[n];
      p = new int[n][n];
      for(i = 0;i < n;i++){
        m[i] = sc.nextInt();
        for(j = 0;j < m[i];j++)p[i][j] = sc.nextInt();
      }
      k = sc.nextInt();
      l = new int[k];
      for(i = 0;i < k;i++)l[i] = sc.nextInt();
      res = -1;
      for(i = 0;i < n;i++){
        if(m[i] < k)continue;
        for(j = 0;j < k;j++){
          for(h = 0;h < m[i];h++)if(p[i][h] == l[j])break;
          if(h == m[i])break;
        }
        if(j == k && res > -1){
          res = -1; break;
        }else if(j == k)res = i + 1;
      }
      out.println(res);
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}