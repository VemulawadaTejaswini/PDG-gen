public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, q, m, c, i, max;
    int[] d;

    d = new int[101];
    for(;;){
      n = sc.nextInt(); q = sc.nextInt();
      if(n == 0 && q == 0)break;
      for(i = 0;i < 101;i++)d[i] = 0;
      for(;n-- > 0;)for(m = sc.nextInt();m-- > 0;){
        c = sc.nextInt(); d[c]++;
      }

      max = 0;
      for(i = 0;i < 101;i++){
        if(d[i] >= q && d[max] < d[i])max = i;
      }
      out.println(max);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}