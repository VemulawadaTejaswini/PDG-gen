public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, sumt, sumh , tt, th;
    int[] st, sh;

    for(;;){
      n = sc.nextInt(); m = sc.nextInt();
      if(n == 0 && m == 0)break;
      st = new int[n]; sh = new int[m];
      sumt = 0;sumh = 0; tt = 201; th = 201;
      for(i = 0;i < n;i++){
        st[i] = sc.nextInt(); sumt += st[i];
      }
      for(i = 0;i < m;i++){
        sh[i] = sc.nextInt(); sumh += sh[i];
      }

      for(i = 0;i < n;i++)for(j = 0;j < m;j++){
        if(sumt - 2 * st[i] == sumh - 2 * sh[j] && tt + th > st[i] + sh[j]){
          tt = st[i]; th = sh[j];
        }
      }

      if(tt != 201 && th != 201)out.println(tt + " " + th);
      else out.println("-1");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}