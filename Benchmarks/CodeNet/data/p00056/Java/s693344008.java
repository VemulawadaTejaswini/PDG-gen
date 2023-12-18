public class Main{
  static int N = 50001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] p;
    int pn, i, j, n, count;

    p = new int[N / 6];
    pn = getprime(p);

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      count = 0;
      for(i = 0;i < pn;i++)for(j = i;j < pn;j++)if(p[i] + p[j] == n)count++;
      out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int getprime(int[] p){
    int i, j, count = 0;
    boolean[] e;
    e = new boolean[N];
    e[0] = true; e[1] = true;
    for(i = 2;i < N;i++)if(!e[i]){
      p[count++] = i;
      for(j = i * 2;j < N;j+=i)e[j] = true;
    }
    return count;
  }
}