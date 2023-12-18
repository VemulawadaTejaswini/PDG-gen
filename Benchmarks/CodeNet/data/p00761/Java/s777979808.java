public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a;
    int l, i, j;

    a = new int[21];
    for(j = 0;;){
      a[0] = sc.nextInt(); l = sc.nextInt();
      if(a[0] == 0 && l == 0)break;
      for(i = 1;i < 21;i++){
        a[i] = solve(a[i - 1], l);
        for(j = 0;j < i;j++)if(a[i] == a[j])break;
        if(i != j)break;
      }
      out.println(j + " " + a[i] + " " + (i - j));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int solve(int a, int l){
    int[] d;
    int i, j, tmp, x, y, k;
    d = new int[l];
    for(i = 0;i < l;i++){
      d[i] = a % 10; a /= 10;
    }
    for(i = 0;i < l - 1;i++)for(j = 0;j < l - 1 - i;j++)if(d[j] > d[j + 1]){
      tmp = d[j]; d[j] = d[j + 1]; d[j + 1] = tmp;
    }
    k = 1; x = 0; y = 0;
    for(i = 0;i < l;i++){
      x += d[i] * k;
      y += d[l - 1 - i] * k;
      k *= 10;
    }
    return (x - y);
  }
}